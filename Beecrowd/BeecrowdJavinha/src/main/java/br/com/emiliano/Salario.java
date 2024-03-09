package br.com.emiliano;

import java.util.Scanner;
import java.io.IOException;


public class Salario {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

        //System.out.println("Informe o número do funcionário:");
        int numero = s.nextInt();

        //System.out.println("Informe o número de horas trabalhadas:");
        int horasTrabalhadas = s.nextInt();

        //System.out.println("Informe o valor da hora trabalhada:");
        double valorHoraTrabalhada = s.nextDouble();

        double salarioCalculado = calculaSalario(horasTrabalhadas, valorHoraTrabalhada);
        String mensagem = exibe(numero, salarioCalculado);

        System.out.println(mensagem);
    }

    public static double calculaSalario(int horasTrabalhadas, double valorHoraTrabalhada) {
        return horasTrabalhadas * valorHoraTrabalhada;
    }

    public static String exibe(int numero, double salario) {
        return String.format("NUMBER = %d\nSALARY = U$ %.2f", numero, salario);
    }
}
