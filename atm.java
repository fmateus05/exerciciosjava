    import java.util.Scanner;
public class atm {
    public static void main(String[] args){
        /*Crie um programa que simule um caixa eletrônico:
O usuário informa um valor e o programa mostra quantas notas de R$50, R$20, R$10 e R$1 são necessárias. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        //variavel que guarda o valor informado pelo usuario
        int valor = sc.nextInt();

        /*informa quantas notas de R$50 são necessarias para atingir o valor informado pelo usuario,
        caso as notas não sejam suficientes para abater o valor, o resto é passado adiante para a próxima verificação*/ 
        int nota50 = valor / 50;
        int resto50 = valor % 50;
        System.out.println("Quantidade de notas de R$50,00: " + nota50);

        //segunda verificação que avalia quantas notas de R$20 serão necessarias para alcançar o valor
        int nota20 = resto50 / 20;
        int resto20 = resto50 % 20;
        System.out.println("Quantidade de notas de R$20,00: " + nota20);

        /*terceira verificação que determina de acordo com o restante do valor abatido com as notas de R$50 e R$20,
        quantas notas de R$10 serão necessárias para abater o restante*/
        int nota10 = resto20 / 10;
        int resto10 = resto20 % 10;
        System.out.println("Quantidade de notas de R$10,00: " + nota10);

        //verifica a quantidade de moedas de R$1 serão necessarias para chegar ao valor exato caso as notas não sejam suficientes
        int moeda1 = resto10 / 1;
        System.out.println("Quantidade de moedas de R$1,00: " + moeda1);
    sc.close();
    }
    
}
