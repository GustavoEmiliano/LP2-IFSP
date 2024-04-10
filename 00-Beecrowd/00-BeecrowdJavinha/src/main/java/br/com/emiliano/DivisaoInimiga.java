package br.com.emiliano;

import java.util.*;
import java.io.IOException;


public class DivisaoInimiga {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Número de soldados
        int m = scanner.nextInt(); // Número de pares de inimigos

        // Criando um mapa para armazenar os inimigos de cada soldado
        Map<Integer, List<Integer>> inimigos = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            inimigos.put(i, new ArrayList<>());
        }

        // Preenchendo o mapa com os inimigos de cada soldado
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            inimigos.get(a).add(b);
            inimigos.get(b).add(a);
        }

        // Listas para armazenar os grupos de soldados
        List<List<Integer>> grupos = new ArrayList<>();

        // Array para marcar os soldados que já foram atribuídos a um grupo
        boolean[] adicionados = new boolean[n + 1];

        // Percorrendo todos os soldados
        for (int i = 1; i <= n; i++) {
            // Se o soldado não foi visitado ainda, adicionamos ele a um novo grupo
            if (!adicionados[i]) {
                List<Integer> grupo = new ArrayList<>();
                adicionados[i] = true;
                grupo.add(i);

                // Adicionando soldados que não são inimigos ao mesmo grupo
                for (int j = 1; j <= n; j++) {
                    if (!adicionados[j] && !temInimigoNoGrupo(j, grupo, inimigos)) {
                        adicionados[j] = true;
                        grupo.add(j);
                    }
                }

                // Adicionando o grupo à lista de grupos
                grupos.add(grupo);
            }
        }

        // Imprimindo o número mínimo de grupos e os soldados em cada grupo
        System.out.println(grupos.size());
        for (List<Integer> grupo : grupos) {
            for (int soldado : grupo) {
                System.out.print(soldado + " ");
            }
            System.out.println();
        }
    }
    private static boolean temInimigoNoGrupo(int soldado, List<Integer> grupo, Map<Integer, List<Integer>> inimigos) {
        for (int inimigo : grupo) {
            if (inimigos.get(soldado).contains(inimigo)) {
                return true;
            }
        }
        return false;
    }
}
