import java.util.Scanner;

public class MediaDeNotas { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        // Scaner usuario usa para digitar    
        int n1, n2, media;
        System.out.println("Informe a primeira nota: ");
        n1 = input.nextInt(); 
        // nextInt só pega número inteiro    
        System.out.println("Informe a segunda nota: ");
        n2 = input.nextInt();
        // nextInt só pega número inteiro    
        media = (n1 + n2) / 2; 
        {
            System.out.print(" A primeira nota foi = " +  n1);
            System.out.print("\n A segunda nota foi = " +  n2);
            System.out.print("\n Sua média é = " +  media + "\n"); 
            if (media >= 8 && media <= 10) { 
                System.out.print("Aluno está APROVADO\n");
            } else if (media >= 5 && media <= 7) {
                System.out.print("Aluno está APROVADO, mas terá que fazer recuperação\n");
            } else if (media >= 0 && media <= 4) {
                 System.out.print("Aluno está REPROVADO\n");
                } else {
                    System.out.print("Erro na media\n");
                }
             } 
            }
        } 