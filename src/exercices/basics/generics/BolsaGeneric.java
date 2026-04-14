package exercices.basics.generics;

/*
 * Objetivo:
 * Criar uma classe genérica simples que armazene um único valor (T)
 * e permita definir e recuperar esse valor.
 */

class Bolsa<T>{
    // Variavel generica
    private T objeto;

    // Getters e setters
    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
}



public class BolsaGeneric {
    public static void main (String[] args){

        // Testando a lista com String
        Bolsa<String> bolsaTexto = new Bolsa<>();
        bolsaTexto.setObjeto("Calculadora");
        System.out.println(bolsaTexto.getObjeto());

        // Testando a lista n's inteiros
        Bolsa<Integer> bolsaNumero = new Bolsa<>();
        bolsaNumero.setObjeto(7);
    }

}
