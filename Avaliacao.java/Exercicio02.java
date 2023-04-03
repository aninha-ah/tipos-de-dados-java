import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int idade;
        String nome;

        Scanner input = new Scanner(System.in); 

        System.out.println("Digite o seu nome: ");
        nome = input.next(); 
        System.out.println("Digite a sua idade: ");
        idade = input.nextInt(); 

        System.out.print("O nome da pessoa é: " + nome + "\n");

        if (idade >= 0 && idade <= 12) { 
            System.out.print("Sua faixa etária é de: criança \n");
        } else if (idade >= 13 && idade <= 17) {
            System.out.print("Sua faixa etária é de: Adolescente \n");
           }  else if (idade >= 18 && idade <= 59) {
            System.out.print("Sua faixa etária é de: Adulto \n");
           } else {
                System.out.print("Sua faixa etária é de: Idoso \n");
            }
        }
    }
