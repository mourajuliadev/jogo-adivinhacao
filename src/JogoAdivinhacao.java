import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100);
        int palpite = 0;
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("JOGO DO NÚMERO SECRETO");
        System.out.println("Tente adivinhar o número secreto entre 1 a 100. Você tem 5 tentativas!");

        while(tentativas>5){
            System.out.println("Palpite: ");
            palpite = leitura.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                acertou = true;
                System.out.println(String.format("Parabéns, o número secreto é %d", numeroAleatorio));
                System.out.println("Você descobriu o número secreto com " + tentativas + " tentativas");
                break;
            }

            if (numeroAleatorio > palpite){
                System.out.println(String.format("O número secreto é maior que %d",palpite ));
            } else {
                System.out.println(String.format("O número secreto é menor que %d",palpite ));

            }


        }



        if (!acertou){
            System.out.println("As tentativas acabaram. Poxa, foi por pouco! Valeu a tentativa. O número secreto é " + numeroAleatorio);
        }







    }
}
