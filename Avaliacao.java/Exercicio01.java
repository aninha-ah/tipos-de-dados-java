import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in); 

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt(); 
        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt(); 
        System.out.println("Digite o terceiro número: ");
        num3 = input.nextInt(); 

        if (num1 > num2 && num1 > num3) { 
            System.out.print("O maior número é o primeiro: " + num1 + "\n");
        } else if (num2 > num1 && num2 > num3) {
            System.out.print("O maior número é o segundo: " + num2 + "\n");
           }  else if (num3 > num1 && num3 > num2) {
            System.out.print("O maior número é o terceiro: " + num3 + "\n");
           }else {
                System.out.print("Os três números são iguais: " + num1 + ", " + num2 + " e " + num3 + ". \n");
            }
}
}
