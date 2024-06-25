package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    public int tempoTotal;

    /*
    * Não tem setter porque queremos apenas o retorno do
    * tempo total, e não modifica-lo
    */

    public int getTempoTotal(){
        return this.tempoTotal;
    }

    /*
    * Essa função é responsávle por inclduir apenas o filme,
    * Não é aconselhável manter um código com esse desing
    */

    /*
    public void inclui(Filme f){
        //pegar tempo total + tempo do filme ou episódios de uma série
        tempoTotal += f.getDuracaoEmMinutos();
    }
    */

    /*
    * Polimorfismo: Usar um metodo que utilize o metodo presente
    * no objeto. Desse modo, não há código duplicados
    */
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
