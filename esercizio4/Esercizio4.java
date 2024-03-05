package esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero diverso da 0");

        int numeroInserito = scanner.nextInt();

        for (int i = numeroInserito; i >= 0; i--) {
            System.out.println(i);
        }


    }
}
