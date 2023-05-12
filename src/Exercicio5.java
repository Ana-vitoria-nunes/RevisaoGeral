public class Exercicio5 {
    public static void main(String[] args) {
        int soma=0,unidade, dezena,centena;

        for (int i=100; i<=150;i++) {
               unidade=i%10;
               dezena=(i/10)%10;
               centena=i/100;

            soma=unidade+dezena+centena;

            if(soma%2==0){
                System.out.println(i);
                System.out.println("A soma dos digitos desse numero é : "+soma);
                System.out.println("---------------------------------------");
            }
        }
    }
}
