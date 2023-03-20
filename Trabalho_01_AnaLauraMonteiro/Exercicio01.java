package Trabalho_01_AnaLauraMonteiro;
import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {
        float cm, m;
        Scanner input = new Scanner(System.in); 



        System.out.println("Informe o valor de metros: ");
        m = input.nextFloat(); 

        cm = m * 100;
        {
            System.out.print("O resultado do valor convertido em centímetros: \n" + cm);
        }
    }
}

