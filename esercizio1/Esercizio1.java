package esercizio1;

public class Esercizio1 {

    public static void main(String[] args) {

        String pariODispari = "trentatre";
        if (pariODispari.length() % 2 == 0)
            System.out.println("La stringa ha un numero pari di caratteri");
        else System.out.println("La stringa ha un numero dispari di caratteri");


        int annoVerifica = 2002;
        if (annoVerifica % 100 == 0 && annoVerifica % 400 == 0 && annoVerifica % 4 == 0 )
        System.out.println("L'anno è bisestile.");
    else System.out.println("L'anno non è bisestile.");
    }
}