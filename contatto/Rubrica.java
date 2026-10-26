package contatto;

import java.util.ArrayList;

public class Rubrica {
    /* ArrayList: aggiungo sempre in fondo (O(1)), accedo ed elimino per indice
        (la posizione che scelgo dal menu) e mantengo l'ordine di inserimento.*/
    private ArrayList<Contatto> contatti = new ArrayList<>();

    public void aggiungi(Contatto c) {
        contatti.add(c);
    }

    public boolean isVuota() {
        return contatti.isEmpty();
    }

    public int size() {
        return contatti.size();
    }

    public Contatto get(int indice) {
        return contatti.get(indice);
    }

    public boolean elimina(int posizione) {
        if (posizione < 1 || posizione > contatti.size()) {

            return false;
        } else {
            contatti.remove(posizione - 1);
            return true;
        }
    }

}
