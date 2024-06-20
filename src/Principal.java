public class Principal {
    public static void main(String[] args) {

        //tipo por referencia, criação de um objeto criado da classe Filme
        Filme meuFilme = new Filme();

        //instanciar objetos
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();

        //incrementa avaliações no metodo avalia
        meuFilme.avalia(9);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        //exibe avaliações
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

    }
}
