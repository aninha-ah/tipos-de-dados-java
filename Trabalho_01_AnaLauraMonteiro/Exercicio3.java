package Trabalho_01_AnaLauraMonteiro;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in); 
        System.out.println("Digite um número de 1 a 7: ");
        num = input.nextInt(); 

        if (num == 1) { 
            System.out.print("O número 1 corresponde a Segunda-feira \n");
         else if (num == 2) {
                System.out.print("O número 2 corresponde a Terça-feira \n");
    }else if (num == 3) {
                System.out.print("O número 3 corresponde a Quarta-feira \n");
    }else if (num == 4) {
                System.out.print("O número 4 corresponde a Quinta-feira \n");
    }else if (num == 5) {
                System.out.print("O número 5 corresponde a Sexta-feira \n");
    }else if (num == 6) {
                System.out.print("O número 6 corresponde a Sábado \n");
    }else (num == 7) {
                System.out.print("O número 7 corresponde a Domingo \n");

           }  

        }
    }

