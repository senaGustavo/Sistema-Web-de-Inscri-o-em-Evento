
package model;

public class Participante {

    private String nome;
    private String email;
    private String tipo;
    private String categoria;

    // Construtor vazio
    public Participante() {
    }

    // Construtor com parâmetros
    public Participante(String nome, String email,
                        String tipo, String categoria) {
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
