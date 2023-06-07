public class Sala {

    private Integer id;

    private Integer numeroSala;

    private String nomeSala;

    private Integer qtdAlunos;

    public Sala(Integer id, Integer numeroSala, String nomeSala, Integer qtdAlunos) {
        this.id = id;
        this.numeroSala = numeroSala;
        this.nomeSala = nomeSala;
        this.qtdAlunos = qtdAlunos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public Integer getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(Integer qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }



}
