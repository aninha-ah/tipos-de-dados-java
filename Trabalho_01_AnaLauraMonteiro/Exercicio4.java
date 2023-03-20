package Trabalho_01_AnaLauraMonteiro;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

    float salario;
        Scanner input = new Scanner(System.in); 

        System.out.println("Informe o valor do salario: ");
        salario, s1, s2, s3 = input.nextDouble(); 

s1 = salario * 1.15;
s2= salario * 1.10;
s3 = salario * 1.05;

        if (salario >= 1000 && salario < 2000) { 
            System.out.print("\n" + nome1 + " é  a pessoa mais velha é, com: \n" + idade1 );
        } else if (salario >= 2000 && salario > 3000) {
            System.out.print("\n" + nome2 + " é a pessoa mais velha é, com: \n" + idade2);
           }   else {
                System.out.print("As duas pessoas tem a mesma idade: \n");
            }
}
