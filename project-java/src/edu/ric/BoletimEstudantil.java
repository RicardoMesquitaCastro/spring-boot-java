package edu.ric;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 5;
        if (mediaFinal < 6) {
            System.out.println("Reprovado");
        } else if (mediaFinal == 6) {
            System.out.println("Quinta prova ");
        } else
            System.out.println("Aprovado");
    }

}
