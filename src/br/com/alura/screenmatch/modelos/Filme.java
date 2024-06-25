package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo {
    //"extends" significa que qualquer filme possui os elementos de um titulo

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}