public class Professor {

    private Integer id;

    private String nome;

    private String materia;

    public Professor(Integer id, String nome, String materia) {
        this.id = id;
        this.nome = nome;
        this.materia = materia;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }



}
