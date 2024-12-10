package edu;
import java.util.Scanner;
import java.util.Locale;
public class AboutMeInput {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US) ;

        System.out.println("Digite sua Altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu Nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Idade");
        int idade = scanner.nextInt();

        //Imprimindo

        System.out.println("Olá, me chamo" + nome + "" + sobrenome);
        System.out.println("Tenho" + idade + " anos" );
        System.out.println("Minha altura é " + altura + " cm" );

    }
}
