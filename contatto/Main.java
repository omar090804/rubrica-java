package contatto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        Scanner scan = new Scanner(System.in);
        int scelta;
        do {
            System.out.println("1) Aggiungi un contatto");
            System.out.println("2) Mostra contatti");
            System.out.println("3) Elimina contatto");
            System.out.println("4) Esci");
            scelta = Integer.parseInt(scan.nextLine());
            switch (scelta) {
                case 1 -> {
                    System.out.print("Inserisci il nome: ");
                    String nome = scan.nextLine();

                    System.out.print("Inserisci l'email: ");
                    String email = scan.nextLine();

                    System.out.print("Inserisci il numero: ");
                    String numero = scan.nextLine();

                    Contatto c = new Contatto(nome, email, numero);
                    rubrica.aggiungi(c);
                }
                case 2 -> {
                    if (rubrica.isVuota()) {
                        System.out.println("Ancora nessun contatto");
                    } else {
                        for (int i = 0; i < rubrica.size(); i++) {
                            System.out.println(rubrica.get(i));
                        }

                    }
                }
                case 3 -> {
                    if (rubrica.isVuota()) {
                        System.out.println("Ancora nessun contatto");
                    } else {
                        for (int i = 0; i < rubrica.size(); i++) {
                            System.out.println(i + 1 + ")" + rubrica.get(i));

                        }
                        System.out.println();
                        System.out.print("Quale contatto vuoi eliminare? ");
                        int daTogliere = Integer.parseInt(scan.nextLine());
                        if (!rubrica.elimina(daTogliere)) {
                            System.out.println("Nessun contatto in questa posizione");
                        }

                    }
                }
                case 4 -> {
                    System.out.println("Arrivederci");
                }
                default -> System.out.println("scelta non valida");
            }
        } while (scelta != 4);
        scan.close();

    }
}
