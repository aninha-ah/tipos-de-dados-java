package Trabalho_01_AnaLauraMonteiro;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int  idade1, idade2;
        String nome1, nome2;

        Scanner input = new Scanner(System.in); 
        System.out.println("Digite o nome da primeira pessoa: ");
        nome1 = input.next(); 
        System.out.println("Digite o nome da segunda pessoa: ");
        nome2 = input.next();
        System.out.println("Digite a idade da primeira pessoa: ");
        idade1 = input.nextInt(); 
        System.out.println("Digite a idade da segunda pessoa: ");
        idade2 = input.nextInt();
        
            System.out.print("\n O nome da primeira pessoa é: " +  nome1);
            System.out.print("\n O nome da segunda pessoa é: " +  nome2);

            if (idade1 > idade2 ) { 
                System.out.print("\n" + nome1 + " é  a pessoa mais velha é, com: \n" + idade1 );
            } else if (idade2 > idade1) {
                System.out.print("\n" + nome2 + " é a pessoa mais velha é, com: \n" + idade2);
               }   else {
                    System.out.print("As duas pessoas tem a mesma idade: \n");
                }
}
}
    

