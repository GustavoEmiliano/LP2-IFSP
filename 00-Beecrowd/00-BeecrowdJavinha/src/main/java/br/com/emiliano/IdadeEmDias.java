package br.com.emiliano;

import java.util.Scanner;
import java.io.IOException;

public class IdadeEmDias {
    public static void main(String []args) throws IOException{

        Scanner s = new Scanner(System.in);

        int idadeDias = 0;
        idadeDias = s.nextInt();
        int anos = calculaAnos(idadeDias);
        int meses = calculaMeses(idadeDias);
        int dias = calculaDias(idadeDias);
        System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");    }
    public static int calculaAnos(int idadeDias){
        int idadeAnos = (idadeDias / 365) ;
        return idadeAnos;
    }
    public static int calculaMeses(int idadeDias){
        int idadeMeses = (idadeDias % 365)/30;
        return idadeMeses;
    }
    public static int calculaDias(int idadeDias){
        int diasIdade = (idadeDias % 365) % 30;
        return diasIdade;
    }
}
