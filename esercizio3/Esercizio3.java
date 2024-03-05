package esercizio3;
import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Inserisci una stringa: ");
            String input = scanner.nextLine();

            if (":q".equals(input)) {
                break;
            }

            StringBuilder stringaNuova = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                stringaNuova.append(input.charAt(i));
                if (i < input.length() - 1) {
                    stringaNuova.append(",");
                }
            }
            System.out.println(stringaNuova);
        }
        scanner.close();

    }

}
