package Trabalho_01_AnaLauraMonteiro;

import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float peso;
        double alt, imc;

        System.out.println("Digite seu peso: ");
        peso = input.nextFloat();
        System.out.println("Digite sua altura: ");
        alt = input.nextDouble();

        imc = peso / (alt * alt);

        if (imc <= 18.5){
            System.out.print("Você está Abaixo do Peso Ideal \n");
        } else if ( imc >= 18.6 && imc <= 24.9){
            System.out.print("Você está com o Peso Normal \n");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.print("Você está com Sobrepeso \n");
        } else if ( imc >= 30.0 && imc <= 34.9){
            System.out.print("Você está com Obesidade Grau I \n");
        } else if (imc >= 35.0 && imc <= 39.9){
            System.out.print("Você está com Obesidade Grau II \n");
        } else (imc >= 40.0){
            System.out.print("Você está com Obesidade Grau III \n");
        }
    }
    }    
