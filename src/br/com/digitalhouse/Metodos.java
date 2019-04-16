package br.com.digitalhouse;

public class Metodos {
    public static void main(String[] args) {
        int resultado;
        resultado = multiplicar(200, 50, 1000);
        System.out.println(resultado + 2);
    }

    public static void meuMetodo() {
        //Corpo do Metodo
        System.out.println("Esse é o meu método! This is my design - says Hannibal!");
    }

    public static int multiplicar(int numero1, int numero2, int numero3) {
        int resultado = 0;
        resultado = numero1 * numero2 * numero3;
        return resultado;
    }
}
