package com.apprizme.apprizme;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String confSenha;

    public Usuario(String s, String toString) {
    }

    public Usuario(String nome, String email, String senha, String confSenha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.confSenha = confSenha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSenha(String senha) { this.senha = senha; }

    public String getSenha() {
        return senha;
    }

    public void setConfSenha(String confSenha) { this.confSenha = confSenha; }

    public String getCongSenha () { return confSenha; }
}
