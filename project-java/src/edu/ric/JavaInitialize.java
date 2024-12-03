package edu.ric; //diretorio = Import no front

public class JavaInitialize {
    public static void main(String[] args) {
        int mediaFinal = 5;
        if (mediaFinal < 6) {
            System.out.println("Reprovado");
        } else if (mediaFinal == 6) {
            System.out.println("Quinta prova ");
        } else
            System.out.println("Aprovado");
    }

    public static void tiposEvariaveis(String[] args) throws Exception {
        // tipos primitivos
        // classe String que representa texto na aplicação

        double salarioMinimo = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        int numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero);
        // Acrecentar final antes da variável nao permite que ela possa ser alterada.
        // Conveção de constantes sempre serem escritas com letras maiúsculas

        final double VALOR_DE_PI = 3.14;
    }

    public static void operadores(String[] args) throws Exception {
            //Universal
        int a ,b;
        a = 6;
        b = 5;
        String resultado = a==b ? "Verdadeiro" : "falso";
        System.out.println(resultado);
    }

    public static void metodos(String[] args) throws Exception {
    //Em arquivos SmartTv.java e usuario.java
}
}
