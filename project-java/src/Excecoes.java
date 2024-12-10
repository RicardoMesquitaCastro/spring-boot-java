import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Excecoes {

public static void main(String[] args) {
try{
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
    scanner.close();
    } 
    catch (InputMismatchException e){
        System.err.println("O campo de idade e altura devem ser númericos");
    }
}
}
