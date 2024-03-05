package esercizio2;

import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");

        int numeroInserito = scanner.nextInt();

        switch (numeroInserito) {

            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default: System.out.println("ERROR");
            break;
        }









        scanner.close();
    }
}
