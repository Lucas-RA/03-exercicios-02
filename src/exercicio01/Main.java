package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Jogador jogador = new Jogador();

//    entrada de dados
        System.out.println("Nome: ");
//        pode usar nextLine pq não tem nenhuma entrada de dados antes dele
        jogador.nome = teclado.nextLine();
        for (int i = 0; i < jogador.score.length; i++) {
            System.out.println("Score: " + (i + 1) + ": ");
            jogador.score[i] = teclado.nextInt();
        }

//        saída de dados
        System.out.println();
        System.out.println("Nome: " + jogador.nome);
        System.out.println("Score total: " + jogador.calcularScoreTotal());






    }
}
