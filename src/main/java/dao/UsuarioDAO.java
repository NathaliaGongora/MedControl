package dao;

import Model.Usuario;
import conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class UsuarioDAO {

        public Usuario buscarPorId(int id){

        Usuario usuario = null;

        String sql =
            "SELECT u.*, c.email, c.senha " +
            "FROM usuarios u " +
            "LEFT JOIN contas c ON c.usuario_id = u.id " +
            "WHERE u.id = ?";

        try{

            Connection conn =
                Conexao.conectar();

            PreparedStatement stmt =
                conn.prepareStatement(sql);

            stmt.setInt(1, id);

            ResultSet rs =
                stmt.executeQuery();

            if(rs.next()){

                usuario = new Usuario();

                usuario.setId(
                    rs.getInt("id")
                );

                usuario.setNome(
                    rs.getString("nome")
                );

                usuario.setIdade(
                    rs.getInt("idade")
                );

                usuario.setSexo(
                    rs.getString("sexo")
                );

                usuario.setAlergias(
                    rs.getString("alergias")
                );

                usuario.setDoencasCronicas(
                    rs.getString("doencas_cronicas")
                );

                usuario.setEmail(
                    rs.getString("email")
                );

                usuario.setSenha(
                    rs.getString("senha")
                );
            }

        } catch(Exception e){

            System.out.println(
                "Erro ao buscar usuário: "
                + e.getMessage()
            );
        }

        return usuario;
    }

    public void atualizarUsuario(
            Usuario usuario
        ){

            String sql =
                "UPDATE usuarios SET " +
                "nome = ?, " +
                "idade = ?, " +
                "sexo = ?, " +
                "alergias = ?, " +
                "doencas_cronicas = ? " +
                "WHERE id = ?";

            try(

                Connection conn =
                    Conexao.conectar();

                PreparedStatement stmt =
                    conn.prepareStatement(sql);

            ){

                stmt.setString(
                    1,
                    usuario.getNome()
                );

                stmt.setInt(
                    2,
                    usuario.getIdade()
                );

                stmt.setString(
                    3,
                    usuario.getSexo()
                );

                stmt.setString(
                    4,
                    usuario.getAlergias()
                );

                stmt.setString(
                    5,
                    usuario.getDoencasCronicas()
                );

                stmt.setInt(
                    6,
                    usuario.getId()
                );

                stmt.executeUpdate();

                JOptionPane.showMessageDialog(
                    null,
                    "Dados atualizados!"
                );

            }catch(Exception e){

                System.out.println(
                    "Erro ao atualizar: "
                    + e.getMessage()
                );
            }
    }
    
    public int criarUsuarioVazio() {

        int idGerado = 0;

        String sql =
            "INSERT INTO usuarios " +
            "(nome, idade, sexo, alergias, doencas_cronicas) " +
            "VALUES ('', 0, '', '', '')";

        try (

            Connection conn =
                Conexao.conectar();

            PreparedStatement stmt =
                conn.prepareStatement(
                    sql,
                    PreparedStatement.RETURN_GENERATED_KEYS
                );

            ) {

            stmt.executeUpdate();

            ResultSet rs =
                stmt.getGeneratedKeys();

            if(rs.next()) {

                idGerado =
                    rs.getInt(1);
            }

        } catch (SQLException e) {

            System.out.println(
                "Erro ao criar usuário: "
                + e.getMessage()
            );
        }

        return idGerado;
    }
}