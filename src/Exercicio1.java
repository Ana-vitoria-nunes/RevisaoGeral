import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float maiorAltura=0,menorAltura=0,SomaAltura=0,altura=0;
        int QuantFeminina=0, QuantMasculina=0;

        menorAltura=altura;
        maiorAltura=altura;

        for (int i=0; i<10; i++){

            System.out.println("Qual seu sexo digite 1-para feminino e 2-para masculino");
            int sexo=entrada.nextInt();

            System.out.println("Qual sua altura: ");
             altura=entrada.nextFloat();

            if (sexo==1){
                QuantFeminina++;
            }
            else if (sexo==2) {
                QuantMasculina++;
                SomaAltura += altura;
            }
            else {
                System.out.println("Invalido");
            }
              if (altura<menorAltura) {
                menorAltura=altura;
            }
             if (altura>maiorAltura) {
                maiorAltura=altura;
            }
        }
        float media=SomaAltura/QuantMasculina;
        System.out.println("A maior altura é: "+maiorAltura+"\nA menor altura é: "+menorAltura);
        System.out.println("A media da altura dos Homens é: "+media);
        System.out.println("A quantidade de mulheres são: "+QuantFeminina);
    }

}