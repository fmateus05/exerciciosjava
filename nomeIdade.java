    import java.util.Scanner;
public class nomeIdade {
    public static void main(String[] args){
/*Crie um programa que receba o nome e a idade de uma pessoa e mostre no formato:
"Olá João, você tem 25 anos."*/
        Scanner sc = new Scanner(System.in);
        //pede o nome do usuario
        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();

        //pede a idade do usuario
        System.out.println("Digite sua idade: ");
        int age = sc.nextInt();

        //mostra as informações do usuario
        System.out.println("Olá " + name + ", você tem " + age + " anos.");

        sc.close();
    }
}
