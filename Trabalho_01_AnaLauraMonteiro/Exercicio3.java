package Trabalho_01_AnaLauraMonteiro;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, s;

        System.out.println("Digite um número de 1 à 7 para o dia da semana coreespondente: ");
        n = input.nextInt();

        if (n == 1)
        {
            System.out.print("O número 1 corresponde à Segunda-feira \n");
        }else if (n == 2){
            System.out.print("O número 2 corresponde à Terça-feira \n");
        }else if (n == 3) {
            System.out.print("O número 3 corresponde à Quarta-feira \n");
        }else if (n == 4){
            System.out.print("O número 4 corresponde à Quinta-feira \n");
        }else if (n == 5) {
            System.out.print("O número 5 corresponde à Sexta-feira \n");
        }else if (n == 6){
            System.out.print("O número 6 corresponde à Sábado \n");
        }else if (n == 7) {
            System.out.print("O número 7 corresponde à Domingo \n");
        }
        else if (n >= 8) {
        System.out.print("Não tem \n");
        }

    
    }
}
