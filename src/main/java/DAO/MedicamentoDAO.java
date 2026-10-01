
package DAO;

import Model.Medicamento;
import Model.Sessao;
import conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import java.util.ArrayList;
import java.util.List;

public class MedicamentoDAO {

    public void salvarMedicamento(Medicamento medicamento) {

        String sql =
                "INSERT INTO medicamentos "
                + "(nome, dosagem, descricao, horario, "
                + "data_validade, data_fim, "
                + "uso_continuo, quantidade, usuario_id) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ) {

            // NOME
            stmt.setString(
                    1,
                    medicamento.getNome()
            );

            // DOSAGEM
            stmt.setString(
                    2,
                    medicamento.getDosagem()
            );

            // DESCRICAO
            stmt.setString(
                    3,
                    medicamento.getDescricao()
            );

            // HORARIO
            stmt.setString(
                    4,
                    medicamento.getHorario()
            );

            // DATA VALIDADE
            if (medicamento.getDataValidade() != null) {

                stmt.setDate(
                        5,
                        java.sql.Date.valueOf(
                                medicamento.getDataValidade()
                        )
                );

            } else {

                stmt.setNull(
                        5,
                        java.sql.Types.DATE
                );
            }

            // DATA FIM
            if (medicamento.getDataFim() != null) {

                stmt.setDate(
                        6,
                        java.sql.Date.valueOf(
                                medicamento.getDataFim()
                        )
                );

            } else {

                stmt.setNull(
                        6,
                        java.sql.Types.DATE
                );
            }

            // USO CONTINUO
            stmt.setBoolean(
                    7,
                    medicamento.isUsoContinuo()
            );

            // QUANTIDADE
            stmt.setInt(
                    8,
                    medicamento.getQuantidade()
            );

            // USUARIO LOGADO
            stmt.setInt(
                    9,
                    medicamento.getUsuarioId()
            );

            stmt.executeUpdate();

            System.out.println(
                    "Medicamento salvo com sucesso!"
            );

        } catch (SQLException e) {

            System.out.println(
                    "Erro ao salvar medicamento: "
                    + e.getMessage()
            );
        }
    }

    public List<String> verificarAlertasVencimento() {

        List<String> alertas =
                new ArrayList<>();

        try (

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(
                            "SELECT nome, data_validade "
                            + "FROM medicamentos "
                            + "WHERE usuario_id = ?"
                    )

        ) {

            stmt.setInt(
                    1,
                    Sessao.idUsuario
            );

            ResultSet rs =
                    stmt.executeQuery();

            LocalDate hoje =
                    LocalDate.now();

            while (rs.next()) {

                String nome =
                        rs.getString("nome");

                java.sql.Date dataSql =
                        rs.getDate("data_validade");

                if (dataSql != null) {

                    LocalDate validade =
                            dataSql.toLocalDate();

                    long dias =
                            ChronoUnit.DAYS.between(
                                    hoje,
                                    validade
                            );

                    if (dias <= 7 && dias >= 0) {

                        alertas.add(
                                nome
                                + " vence em "
                                + dias
                                + " dias."
                        );
                    }

                    if (dias < 0) {

                        alertas.add(
                                nome
                                + " está vencido!"
                        );
                    }
                }
            }

        } catch (Exception e) {

            System.out.println(
                    "Erro ao verificar alertas: "
                    + e.getMessage()
            );
        }

        return alertas;
    }

    public List<String> verificarHorarioMedicamentos() {

        List<String> alertas =
                new ArrayList<>();

        try (

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(
                            "SELECT nome, horario "
                            + "FROM medicamentos "
                            + "WHERE usuario_id = ?"
                    )

        ) {

            stmt.setInt(
                    1,
                    Sessao.idUsuario
            );

            ResultSet rs =
                    stmt.executeQuery();

            java.time.LocalTime agora =
                    java.time.LocalTime.now();

            while (rs.next()) {

                String nome =
                        rs.getString("nome");

                String horarioBanco =
                        rs.getString("horario");

                if (horarioBanco != null) {

                    java.time.LocalTime horario =
                            java.time.LocalTime.parse(
                                    horarioBanco
                            );

                    if (
                        agora.getHour()
                        == horario.getHour()

                        &&

                        agora.getMinute()
                        == horario.getMinute()
                    ) {

                        alertas.add(
                                "Hora de tomar: "
                                + nome
                        );
                    }
                }
            }

        } catch (Exception e) {

            System.out.println(
                    "Erro nos alertas: "
                    + e.getMessage()
            );
        }

        return alertas;
    }

    public void excluirMedicamento(int id) {

        String sql =
                "DELETE FROM medicamentos "
                + "WHERE id = ? "
                + "AND usuario_id = ?";

        try (

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ) {

            stmt.setInt(
                    1,
                    id
            );

            stmt.setInt(
                    2,
                    Sessao.idUsuario
            );

            stmt.executeUpdate();

            System.out.println(
                    "Medicamento excluído!"
            );

        } catch (SQLException e) {

            System.out.println(
                    "Erro ao excluir: "
                    + e.getMessage()
            );
        }
    }

    public List<Medicamento> listarMedicamentos() {

        List<Medicamento> lista =
                new ArrayList<>();

        String sql =
                "SELECT * FROM medicamentos "
                + "WHERE usuario_id = ?";

        try (

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ) {

            stmt.setInt(
                    1,
                    Sessao.idUsuario
            );

            ResultSet rs =
                    stmt.executeQuery();

            while (rs.next()) {

                Medicamento med =
                        new Medicamento();

                med.setId(
                        rs.getInt("id")
                );

                med.setNome(
                        rs.getString("nome")
                );

                med.setDescricao(
                        rs.getString("descricao")
                );

                med.setDosagem(
                        rs.getString("dosagem")
                );

                med.setHorario(
                        rs.getString("horario")
                );

                med.setQuantidade(
                        rs.getInt("quantidade")
                );

                med.setUsoContinuo(
                        rs.getBoolean("uso_continuo")
                );

                java.sql.Date validade =
                        rs.getDate("data_validade");
                
                med.setStatusTomado(
                        rs.getBoolean("status_tomado")
                );

                if (validade != null) {

                    med.setDataValidade(
                            validade.toLocalDate()
                    );
                }

                java.sql.Date dataFim =
                        rs.getDate("data_fim");

                if (dataFim != null) {

                    med.setDataFim(
                            dataFim.toLocalDate()
                    );
                }

                med.setUsuarioId(
                        rs.getInt("usuario_id")
                );

                lista.add(med);
            }

        } catch (Exception e) {

            System.out.println(
                    "Erro ao listar medicamentos: "
                    + e.getMessage()
            );
        }

        return lista;
    }
    
    public void marcarComoTomado(int id){

        String sql =
                "UPDATE medicamentos "
                + "SET status_tomado = 1 "
                + "WHERE id = ?";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ){

            stmt.setInt(1, id);

            stmt.executeUpdate();

            System.out.println(
                    "Medicamento marcado como tomado!"
            );

        }catch(Exception e){

            System.out.println(
                    "Erro: "
                    + e.getMessage()
            );
        }
    }
    
    public List<String> verificarQuantidadeBaixa() {

        List<String> alertas =
                new ArrayList<>();

        try (

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(
                            "SELECT nome, quantidade "
                            + "FROM medicamentos "
                            + "WHERE usuario_id = ?"
                    )

        ) {

            stmt.setInt(
                    1,
                    Sessao.idUsuario
            );

            ResultSet rs =
                    stmt.executeQuery();

            while (rs.next()) {

                String nome =
                        rs.getString("nome");

                int quantidade =
                        rs.getInt("quantidade");

                if (quantidade <= 5) {

                    alertas.add(
                            nome
                            + " está acabando! "
                            + "("
                            + quantidade
                            + " restantes)"
                    );
                }
            }

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }

        return alertas;
    }
    
    public void diminuirQuantidade(int id){

        String sql =
                "UPDATE medicamentos "
                + "SET quantidade = quantidade - 1 "
                + "WHERE id = ? "
                + "AND quantidade > 0";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ){

            stmt.setInt(1, id);

            stmt.executeUpdate();

            System.out.println(
                    "Quantidade atualizada!"
            );

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }
    }
    
    public void atualizarMedicamento(Medicamento medicamento){

        String sql =
                "UPDATE medicamentos SET "
                + "nome = ?, "
                + "descricao = ?, "
                + "dosagem = ?, "
                + "horario = ?, "
                + "data_validade = ?, "
                + "data_fim = ?, "
                + "uso_continuo = ?, "
                + "quantidade = ? "
                + "WHERE id = ?";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ){

            stmt.setString(1, medicamento.getNome());

            stmt.setString(2, medicamento.getDescricao());

            stmt.setString(3, medicamento.getDosagem());

            stmt.setString(4, medicamento.getHorario());

            stmt.setDate(
                    5,
                    java.sql.Date.valueOf(
                            medicamento.getDataValidade()
                    )
            );

            if(medicamento.getDataFim() != null){

                stmt.setDate(
                        6,
                        java.sql.Date.valueOf(
                                medicamento.getDataFim()
                        )
                );

            }else{

                stmt.setNull(
                        6,
                        java.sql.Types.DATE
                );
            }

            stmt.setBoolean(
                    7,
                    medicamento.isUsoContinuo()
            );

            stmt.setInt(
                    8,
                    medicamento.getQuantidade()
            );

            stmt.setInt(
                    9,
                    medicamento.getId()
            );

            stmt.executeUpdate();

            System.out.println(
                    "Medicamento atualizado!"
            );

        }catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }
    }
    
    public Medicamento buscarPorId(int id){

        Medicamento med =
                null;

        String sql =
                "SELECT * FROM medicamentos "
                + "WHERE id = ?";

        try(

            Connection conn =
                    Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

        ){

            stmt.setInt(1, id);

            ResultSet rs =
                    stmt.executeQuery();

            if(rs.next()){

                med =
                        new Medicamento();

                med.setId(
                        rs.getInt("id")
                );

                med.setNome(
                        rs.getString("nome")
                );

                med.setDescricao(
                        rs.getString("descricao")
                );

                med.setDosagem(
                        rs.getString("dosagem")
                );

                med.setHorario(
                        rs.getString("horario")
                );

                med.setQuantidade(
                        rs.getInt("quantidade")
                );

                med.setUsoContinuo(
                        rs.getBoolean("uso_continuo")
                );

                java.sql.Date validade =
                        rs.getDate("data_validade");

                if(validade != null){

                    med.setDataValidade(
                            validade.toLocalDate()
                    );
                }
            }

        }catch(Exception e){

            System.out.println(
                "Erro ao buscar medicamento: "
                + e.getMessage()
            );
        }

        return med;
    }
    
}