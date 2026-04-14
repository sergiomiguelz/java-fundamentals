package exercices.basics.generics;

/*
 * Objetivo:
 * Criar uma classe genérica simples que armazene um único valor (T)
 * e permita definir e recuperar esse valor.
 */

class Caixa<T>{
    // Variavel generica
    private T objeto;

    // Getters e setters
    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public void showInfo(){
        System.out.println(getObjeto());
    }
}



public class ListaGenerica2 {
    public static void main (String[] args){

        // Testando a lista com String
        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.setObjeto("Calculadora");

        // Testando a lista n's inteiros
        Caixa<Integer> caixaNumero = new Caixa<>();
        caixaNumero.setObjeto(10);
        caixaNumero.showInfo();
    }

}
