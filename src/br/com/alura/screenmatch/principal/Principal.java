package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
        System.out.println("Começando no Java: ");
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);

        System.out.println("A duração do filme, presente no objeto meuFilme é: " + meuFilme.getDuracaoEmMinutos() + " minutos");

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("A duração para maratonar a série Lost no objeto lost é: " + lost.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme("Avatar", 2023);

        outroFilme.setDuracaoEmMinutos(200);

        System.out.println("\nTrabalhando com dois objetos:\n");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("A duração para assistir os filmes e série dos objetos é de: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setNome("piloto");
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        System.out.println("\nTrabalhando com ArrayLists:\n");

        /*
        * É possível utilizar variáveis na criação de novos objetos,
        * contanto que recebam um valor na mesma linha!
        */

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFIlmes = new ArrayList<>();
        listaDeFIlmes.add(filmeDoPaulo);
        listaDeFIlmes.add(meuFilme);
        listaDeFIlmes.add(outroFilme);
        System.out.println("Tamanho da lista de filmes: " + listaDeFIlmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFIlmes.get(0).getNome());
        System.out.println(listaDeFIlmes);
        System.out.println("toString do filme, após sobrescrita: " + listaDeFIlmes.get(0).toString());


    }

}