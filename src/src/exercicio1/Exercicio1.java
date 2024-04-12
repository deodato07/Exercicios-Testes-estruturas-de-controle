package exercicio1;

/*Faça um algoritmo para ler um número que é um código de usuário.
Caso este código seja diferente de um código armazenado internamente
no algoritmo (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’.
Caso o Código seja correto, deve ser lido outro valor que é a senha.
Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’.
Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        int codigo, senha;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o código de acesso: ");
        codigo = entrada.nextInt();

    }
}