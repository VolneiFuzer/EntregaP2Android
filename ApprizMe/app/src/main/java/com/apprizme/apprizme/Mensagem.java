package com.apprizme.apprizme;

import com.firebase.client.Firebase;

public class Mensagem {

    private String tituloMensagem;
    private String corpoMensagem;

    public Mensagem(String s) {
    }

    public Mensagem (String tituloMensagem, String corpoMensagem){
        this.tituloMensagem = tituloMensagem;
        this.corpoMensagem = corpoMensagem;
    }

    public void setNome(String tituloMensagem) {
        this.tituloMensagem = tituloMensagem;
    }

    public String getTituloMensagem() {
        return tituloMensagem;
    }

    public void setCorpoMensagem(String corpoMensagem) {
        this.corpoMensagem = corpoMensagem;
    }

    public String getCorpoMensagem(){
        return corpoMensagem;
    }

}
