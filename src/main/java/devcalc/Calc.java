// 1 - Pacote
package devcalc;
// 2 - Bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Calc {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in); // entrada = input

    // 3.2 - Métodos e Funções
    public static void main(String[] args){

        // Exibe o menu da calculadora
        System.out.println(">>> CALCULADORA <<<");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.print("Escolha o Calculo Desejado: ");

        //Recebe a opção desejada
        int opcao = entrada.nextInt();
        int nun1 = 0;
        int nun2 = 0;


        //Pergunta os valores a serem usados no calculo

        if(opcao >= 1 && opcao <= 4){
            System.out.print("Entre o 1º numero:");
            nun1 = entrada.nextInt();
            System.out.print("Entre o 2º numero:");
            nun2 = entrada.nextInt();
            System.out.print("O resultado é:");
        }


       // Chama a função do calculo desejado

       switch (opcao){
           case 1:
               System.out.println(somarDoisNumeros(nun1, nun2));
               break;

           default:
               System.out.println("Opção inválida");
               break;
       }


    }
    public static int somarDoisNumeros(int nun1, int nun2){

        return nun1 + nun2;
    }
}
