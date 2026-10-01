
package Model;

import java.time.LocalDate;

public class Medicamento {
    private int id;
    private String nome;
    private String descricao;
    private String dosagem;
    private String horario;
    private LocalDate dataValidade;
    private LocalDate dataFim;
    private boolean usoContinuo;
    private int quantidade;
    private int usuarioId;
    private boolean statusTomado;
    
    public Medicamento(int id, String nome, String descricao, String dosagem, String horario, LocalDate dataValidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dosagem = dosagem;
        this.horario = horario;
        this.dataValidade = dataValidade;
    }

    public Medicamento() {
        
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getDosagem() { return dosagem; }
    public void setDosagem(String dosagem) { this.dosagem = dosagem; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public LocalDate getDataValidade() { return dataValidade; }
    public void setDataValidade(LocalDate dataValidade) { this.dataValidade = dataValidade; }
        
    public LocalDate getDataFim() {return dataFim;}
    public void setDataFim(LocalDate dataFim) { this.dataFim = dataFim;}
    
    public boolean isUsoContinuo() {return usoContinuo;}
    public void setUsoContinuo(boolean usoContinuo) {this.usoContinuo = usoContinuo;}

    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
    
    public int getUsuarioId() {return usuarioId;}
    public void setUsuarioId(int usuarioId) {this.usuarioId = usuarioId;}
    
    public boolean isStatusTomado() {return statusTomado;}
    public void setStatusTomado(boolean statusTomado) {this.statusTomado = statusTomado;}

}