import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

       double quantidadeFuncionario, totalSalario=0, contador=0,media;


        System.out.println("Qual a quantidade de funcionarios: ");
        quantidadeFuncionario= entrada.nextInt();

        for (int i=0; i<quantidadeFuncionario;i++){
            System.out.println("Difite o salario do "+(i+1)+"º funcionario");
            double salario=entrada.nextDouble();
            contador++;
            totalSalario= totalSalario+salario;
        }
        media=totalSalario/quantidadeFuncionario;
        System.out.println("A media salaria da empresa é: "+media);
    }
}
