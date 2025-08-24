    import java.util.Scanner;
public class largNum {
    public static void main(String[] args){
        //Crie um programa que leia 5 números e mostre o maior deles.
        Scanner sc = new Scanner(System.in);

        //array que guarda 5 variaveis
        int[] n = new int[5];

        //for loop que passa pede o valor das 5 variaveis
        for(int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
        }
        //variavel que guarda o maior numero do array
        int maiorNumero = n[0];

        //for loop que passa por todos os 5 numeros do array verificando qual é o maior
        for(int i = 1; i < n.length; i++){
            if(n[i] > maiorNumero){
                maiorNumero = n[i];
            }
        }
        System.out.println("O maior número é " + maiorNumero);
    sc.close();
    }
}
