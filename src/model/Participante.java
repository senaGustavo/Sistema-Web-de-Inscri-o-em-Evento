package model;

public class Participante {
    protected String nome = null;
    protected String email = null;
    protected boolean tipo;
    protected String categoria = null;

    public Participante(String nome, String email, boolean tipo, String categoria) {
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

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
