package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    /*
    * Utilizando a classe FiltroRecomendacao, é possível
    * trabalhar com qualquer objeto que implemente a interface
    * Classificavel, tornando o código mais flexível e
    * extensivel
    */
    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento!");
        } else if (classificavel.getClassificacao() <= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
