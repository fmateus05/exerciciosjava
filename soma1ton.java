    import java.util.Scanner;
public class soma1ton {
    public static void main(String[] args) {
        //Faça um programa que calcule a soma de todos os números de 1 até N, onde N é digitado pelo usuário.
        Scanner sc = new Scanner(System.in);
        //declaro as variaveis base do programa
        int soma = 0;
        int n = sc.nextInt();
        //for loop que verifica e realiza a soma de 1 até o número escolhido pelo usuário.
        for (int i = 0; i <= n; i++){
            soma += i;
        }
        //mostra ao usuário a soma
        System.out.println("A soma de 1 até " + n + " é: " + soma);
        sc.close();
    }
}
