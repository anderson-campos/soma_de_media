import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        int soma = 0;
        int numeroUsuario = 0;
        int media = 0;
        int i = 0;

        do {
            if (i == 0) {
                System.out.println("Digite o PRIMEIRO numero: ");
            } else if (i == 1) {
                System.out.println("Digite o SEGUNDO numero: ");
            } else if (i == 2) {
                System.out.println("Digite o TERCEIRO numero: ");
            } else if (i == 3) {
                System.out.println("Digite o QUARTO numero: ");
            } else if (i == 4) {
                System.out.println("Digite o QUINTO numero: ");
            } else if (i == 5) {
                System.out.println("Digite o SEXTO numero: ");
            } else if (i == 6) {
                System.out.println("Digite o SETIMO numero: ");
            } else if (i == 7) {
                System.out.println("Digite o OITAVO numero: ");
            } else if (i == 8) {
                System.out.println("Digite o NONO numero: ");
            } else if (i == 9) {
                System.out.println("Digite o DECIMO numero: ");
            }
            numeroUsuario = scam.nextInt();
            soma += numeroUsuario;
            i++;
        }while (i <= 9) ;

        media = soma / i;
        System.out.println("O valor da soma é de: " + soma);
        System.out.println("O valor da média é de: " + media);
    }
}