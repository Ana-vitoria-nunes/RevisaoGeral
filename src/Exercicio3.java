import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num= entrada.nextInt();

        if (num%7==0 && num%5==0){
            System.out.println("O número é multiplo por 5 e 7.");
        }
        else {
            System.out.println("O número não é multiplo por 7 e 5.");
        }
    }
}
