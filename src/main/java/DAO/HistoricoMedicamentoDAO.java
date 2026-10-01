package DAO;

import Model.HistoricoMedicamento;
import Model.Sessao;
import conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class HistoricoMedicamentoDAO {

    public List<HistoricoMedicamento> listarHistoricoHoje(){

        List<HistoricoMedicamento> lista =
                new ArrayList<>();

        String sql =
                "SELECT h.*, m.nome\n" +
                "FROM historico_medicamentos h\n" +
                "INNER JOIN medicamentos m\n" +
                "ON h.medicamento_id = m.id\n" +
                "WHERE h.usuario_id = ?\n" +
                "AND h.data = ?";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ){

            stmt.setInt(
                    1,
                    Sessao.idUsuario
            );

            stmt.setDate(
                    2,
                    java.sql.Date.valueOf(
                            LocalDate.now()
                    )
            );

            ResultSet rs =
                    stmt.executeQuery();

            while(rs.next()){

                HistoricoMedicamento h =
                        new HistoricoMedicamento();

                h.setNomeMedicamento(
                    rs.getString("nome")
                );

                h.setMedicamentoId(
                        rs.getInt("medicamento_id")
                );

                h.setTomado(
                        rs.getBoolean("tomado")
                );

                lista.add(h);
            }

        }catch(Exception e){

            System.out.println(
                    "Erro histórico: "
                    + e.getMessage()
            );
        }

        return lista;
    }
    
    public void marcarComoTomado(int id){

        String sql =
                "UPDATE historico_medicamentos "
                + "SET tomado = 1, "
                + "data_hora_tomado = GETDATE() "
                + "WHERE id = ?";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ){

            stmt.setInt(1, id);

            stmt.executeUpdate();

        }catch(Exception e){

            System.out.println(
                    "Erro ao marcar: "
                    + e.getMessage()
            );
        }
    }
}
