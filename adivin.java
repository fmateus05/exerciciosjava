    import java.util.Scanner;
    import java.util.Random;
public class adivin {
    public static void main(String[] args){
/*Jogo de Adivinhação
Crie um pequeno jogo de adivinhação. O programa deve "pensar" em um número aleatório entre 1 e 100.
O usuário tem um número ilimitado de tentativas para adivinhar o número. A cada tentativa, o programa deve dizer se o palpite do usuário é "muito alto" ou "muito baixo".
Quando o usuário acertar, o programa deve parabenizá-lo e dizer quantas tentativas foram necessárias. */
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //variavel que guarda o número designado pelo computador
        int numeroAleatorio = random.nextInt(100) + 1;
        
        //variavel que guarda a quantidade de tentativas
        int tentativas = 0;
        //variavel que guarda o palpite do usuario
        int chute;
        //do-while loop que pede ao usuario que informe o seu palpite/chute e adiciona +1 a cada chute até o correto
        do{
            System.out.println("Dê o seu palpite: ");
            chute = sc.nextInt();
            tentativas++;
            //caso o palpite do usuario seja menor que o número aleatório determinado pelo programa a mensagem "Muito baixo" é mostrada na tela
            if(chute < numeroAleatorio){
                System.out.println("Muito baixo");
            //o mesmo acontece se for maior apresentando a tela a mensagem "Muito alto"
            }else if(chute > numeroAleatorio){
                System.out.println("Muito alto");
            }
            //quando o usuario acerta o número é parabenizado e informado com a quantidade de tentativas
        } while(chute != numeroAleatorio);
        System.out.println("Parabéns você acertou em " + tentativas + " tentativas!");
        sc.close();
        }
    }

