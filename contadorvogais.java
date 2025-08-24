    import java.util.Scanner;
public class contadorvogais {
    public static void main(String[] args){
        /*Contador de Vogais
Faça um programa que leia uma palavra do usuário (uma String) e conte quantas vogais (a, e, i, o, u) ela contém.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua palavra: ");
        //string que pede a palavra escolhida pelo usuario
        String palavra = sc.nextLine();
        // contador de vogais iniciado com 0
        int contadorVogais = 0;

        //for loop que passa pela palavra verificando a quantidade de vogais
        for(int i = 0; i < palavra.length(); i++){
            char letra = Character.toLowerCase(palavra.charAt(i));
            //if que adiciona +1 no contador caso as vogais sejam apresentadas
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                 contadorVogais++;   
            }
            
        }
        //mostra a quantidade de vogais da palavra
        System.out.println("Sua palvra contém " + contadorVogais + " vogais");
        sc.close();
    }
    
}
