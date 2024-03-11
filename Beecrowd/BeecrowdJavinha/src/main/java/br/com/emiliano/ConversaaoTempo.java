package br.com.emiliano;

import java.io.IOException;
import java.util.Scanner;

public class ConversaaoTempo {
    public static void main(String []args) throws IOException{

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();

        int valorHora = converteHora(N);
        int valorMin = converteMinutos(N);
        int valorSegundos = calculaSegundos(N);
        System.out.println(valorHora + ":" + valorMin + ":" + valorSegundos);
    }
    public static int converteHora(int N){
        return N / 3600;
    }
    public static int converteMinutos(int N){
        return (N % 3600) / 60;
    }
    public static int calculaSegundos(int N){
        return N % 60;
    }
    
}
