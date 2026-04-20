package exercices.basics.generics;

/*
 * Objetivo:
 * Criar uma classe genérica que possua um método para exibir o valor armazenado.
 */

class Caixa<T> {

    // Atributo genérico
    private T valor;

    // Getter
    public T getValor() {
        return valor;
    }

    // Setter
    public void setValor(T valor) {
        this.valor = valor;
    }

    // Método para exibir valor
    public void showInfo() {
        System.out.println(valor);
    }
}



public class CaixaGeneric {
    public static void main(String[] args) {

        // Testando com String
        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.setValor("Calculadora");
        caixaTexto.showInfo();

        // Testando com Integer
        Caixa<Integer> caixaNumero = new Caixa<>();
        caixaNumero.setValor(10);
        caixaNumero.showInfo();
    }
}