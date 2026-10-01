package dao;

import conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Usuario;

public class ContaDAO {

    public Usuario realizarLogin(
            String email,
            String senha
    ) {

        String sql =

            "SELECT " +
            "u.id, " +
            "u.nome, " +
            "u.idade, " +
            "u.sexo, " +
            "u.alergias, " +
            "u.doencas_cronicas, " +
            "c.email, " +
            "c.senha " +

            "FROM contas c " +

            "INNER JOIN usuarios u " +
            "ON c.usuario_id = u.id " +

            "WHERE c.email = ? " +
            "AND c.senha = ?";

        try (

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ) {

            stmt.setString(1, email);

            stmt.setString(2, senha);

            ResultSet rs =
                    stmt.executeQuery();

            if(rs.next()){

                Usuario usuario =
                        new Usuario();

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

                return usuario;
            }

        } catch (SQLException e) {

            System.out.println(
                    "Erro no login: "
                    + e.getMessage()
            );
        }

        return null;
    }

    public void salvarConta(
            String email,
            String senha,
            int usuarioId
    ) {

        String sql =
            "INSERT INTO contas " +
            "(email, senha, usuario_id) " +
            "VALUES (?, ?, ?)";

        try (

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ) {

            stmt.setString(1, email);

            stmt.setString(2, senha);

            stmt.setInt(3, usuarioId);

            stmt.executeUpdate();

            System.out.println(
                    "Conta criada com sucesso!"
            );

        } catch (SQLException e) {

            System.out.println(
                    "Erro ao salvar conta: "
                    + e.getMessage()
            );
        }
    }
}