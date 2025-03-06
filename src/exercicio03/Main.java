package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);

        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        System.out.println("Ponto 1 - X: ");
        p1.x = sc.nextInt();
        System.out.println("Ponto 1 - Y: ");
        p1.y = sc.nextInt();

        System.out.println("Ponto 2 - X: ");
        p2.x = sc.nextInt();
        System.out.println("Ponto 2 - Y: ");
        p2.y = sc.nextInt();

//        impressão da distância entre os 2 pontos
        System.out.println("Distância do p1 para o p2: " + df.format(p1.calcularDistancia(p2)));
        System.out.println("Distância do p2 para o p1: " + df.format(p1.calcularDistancia(p1)));

//        impressão da distância de cada ponto até a origem
        System.out.println();
        System.out.println("Distância do p1 até a origem: " + df.format(p1.calcularDistanciaAteOrigem()));
        System.out.println("Distância do p2 até a origem: " + df.format(p2.calcularDistanciaAteOrigem()));

//        impressão do ponto mais próximo da origem:
        System.out.println();
        Ponto aux = p1.maisProximoDaOrigem(p1,p2);
        System.out.println("Ponto mais próximo: " + aux.formatarPonto());
    }
}
