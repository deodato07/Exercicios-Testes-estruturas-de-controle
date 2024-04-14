package exercicio2;
/*
* Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
*  Fazer um algoritmo que calcule e escreva:
* a. a maior e a menor altura do grupo;
* b. média de altura dos homens;
* c. o número de mulheres. 
* (usar For)
* */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int qtdMulher = 0;
        int qtdHomem = 0;
        int sexo = 0;
        double altura = 0;
        double somaH = 0;
        double mediaHomens = 0;
        double maior=0;
        double menor=0;

        Scanner entrada = new Scanner(System.in);


        for (int i = 0; i < 10 ; i++) {
            System.out.print("insira o sexo da pessoa (1-Homen, 2-mulher): ");
            sexo = entrada.nextInt();

            System.out.println("Digite a altura");
            altura = entrada.nextDouble();

            if (sexo == 1){
                qtdHomem++;
            }else if(sexo == 2){
                qtdMulher++;
                somaH = somaH + altura;
            }else{
                System.out.println("opção de sexo invalida");
            }
            if(altura > maior){
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }
        }
        mediaHomens = somaH / qtdHomem;

        System.out.println("a maior altura do grupo é " + maior + "m, e a menor é de" + menor +"m");
        System.out.println("a media de altura dos homens é de " + mediaHomens +"m, " );
        System.out.println("O nomero de mulheres é " + qtdMulher);
        
        entrada.close();
    }
}
