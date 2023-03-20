package Trabalho_01_AnaLauraMonteiro;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

    float salario, sm;
        Scanner input = new Scanner(System.in); 

        System.out.println("Informe o valor do salario: ");
        salario = input.nextDouble(); 

        if (salario >= 1000 && salario < 2000) { 
           sm = salario * 1.15;
            System.out.print("\n" + "Seu novo salário é": \n" + salario);

        } else if (salario >= 2000 && salario > 3000) {
            sm = salario * 1.10;
            System.out.print("\n" Seu novo salário é: \n" + salario);

           }   else {
            sm = salario * 1.05;
                System.out.print("As duas pessoas tem a mesma idade: \n");
            }
}
