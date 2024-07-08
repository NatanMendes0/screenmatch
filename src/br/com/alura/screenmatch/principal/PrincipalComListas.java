package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

//pacotes java.util
import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(6);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(5);

//        variavel de referencia, para chegar até tal objeto
        Filme f1 = filmeDoPaulo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);

        // por ser uma série, o arraylist não aceita esse objeto, pois tinhmos parametrizado o <>
        // para trabalhar com classes de Filmes. É necessário definir o ArrayList como <Titulo>,
        // a classe mãe de Filme e Serie
        lista.add(lost);

//        exemplos de métodos para percorer uma lista
//        exemplo 1
        for (Titulo item : lista) {
            System.out.println(item.getNome());

//            formas de verificar se o item exibido pertence a classe Filme:
//            1ª forma:
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: "+ filme.getClassificacao());
            }
        }

//        exemplo 2
//        lista.forEach(System.out::println);

//        exemplo 3
//        lista.forEach(System.out::println);

        //Ordenar string alfabeticamente com o Comparable
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");

        Collections.sort(buscaPorArtista); //ordena a lista alfabeticamente

        System.out.println("Depois da ordenação do arraylist buscaPorArtistas");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista );
        System.out.println(lista);
    }
}
