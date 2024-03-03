package View;

import Controller.qtdeInteiro;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        qtdeInteiro qtI = new qtdeInteiro();

        System.out.print("Insira um número inteiro: ");
        int n = scan.nextInt();


        System.out.println("Quantidade de dígitos: " + qtI.funcqtdeInteiro(n));




    }


}
