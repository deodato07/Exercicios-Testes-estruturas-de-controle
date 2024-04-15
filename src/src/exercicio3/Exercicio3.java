package exercicio3;
/*Número primo é aquele que só é divisível por ele mesmo e pela unidade.
Fazer um algoritmo que determine e escreva os números primos compreendidos entre um intervalo fornecido pelo usuário.
(usar For)*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
    int inicio = 0;
    int primo = 0;
    int fim = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Número inicial: ");
        inicio = entrada.nextInt();
        System.out.print("Número final: ");
        fim = entrada.nextInt();

        for (int i=inicio; i<=fim; i++) {
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println("O número " + i + " é PRIMO!");
            }
            primo = 0;
        }

        entrada.close();

    }
}
