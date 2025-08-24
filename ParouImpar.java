    import java.util.Scanner;
public class ParouImpar {
    public static void main(String[] args) {
        //Escreva um programa que receba um número inteiro e diga se ele é par ou ímpar.
      Scanner sc = new Scanner(System.in);
        // variavel que pede um número
        int n = sc.nextInt();
        //if/else que verifica se é par ou ímpar
        if(n % 2 == 0){
            System.out.println("PAR");            
        }else{
            System.out.println("ÍMPAR");
        }
        sc.close();
    }
}
