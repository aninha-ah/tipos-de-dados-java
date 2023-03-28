package Trabalho_01_AnaLauraMonteiro;

import java.util.Scanner;


public class Exercicio4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sn, sal;

        System.out.println("Escreva seu Salário Atual: ");
        sal = input.nextDouble();


        if (sal >= 1000 && sal < 2000){
            sn = sal * 1.15;
            System.out.print("Seu novo salário é: "+ sn + "\n");
        }else if (sal >= 2000 &&  sal < 3000){
            sn = sal * 1.10;
            System.out.print("Seu novo salário é: "+ sn +"\n");
        }else if (sal > 3000) {
            sn = sal * 1.05;
            System.out.print("Seu novo salário é: "+ sn +"\n");
        }
    }
}