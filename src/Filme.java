public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //criação do metodo para mostrar os dados de qualquer filme
    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    //incrementa as variaveis destinadas a avaliação
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    //metodo que retorna um valor
    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}