package br.com.emiliano;

import java.util.Scanner;
import java.io.IOException;

public class PulaSapo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int P = 0; // altura do pulo do sapo
        int N = 0; // numero de canos do jogo
        P = scanner.nextInt();
        N = scanner.nextInt();
        int[] alturasCano = new int[N];

        // Lê as alturas dos canos
        for (int i = 0; i < N; i++) {
            alturasCano[i] = scanner.nextInt();
        }

        if (verificaPulo(P, N, alturasCano))
            System.out.println("YOU WIN");
        else
            System.out.println("GAME OVER");
    }

    public static boolean verificaPulo(int alturaPulo, int numCanos, int[] alturasCanos) {
        for (int i = 1; i < numCanos; i++) {
            int diferencaAltura;
            if (alturasCanos[i] > alturasCanos[i - 1])
                diferencaAltura = alturasCanos[i] - alturasCanos[i - 1];
            else
                diferencaAltura = alturasCanos[i - 1] - alturasCanos[i];
            if (diferencaAltura > alturaPulo)
                return false;
        }
        return true;
    }
}