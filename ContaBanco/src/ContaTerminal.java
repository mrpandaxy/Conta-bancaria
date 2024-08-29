import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
    /* O programa é uma simulação de um sistema de registro bancario. */
     
       
        int numero;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite o numero de sua Agência: ");
        numero = scanner.nextInt();

        System.out.println("digite a sua agência: ");
        String agencia = scanner.next();

        System.out.println("digite seu nome: ");
        String nome = scanner.next();

        System.out.println("digite seu saldo");
        saldo = scanner.nextDouble();



        System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");





    
    }

}
