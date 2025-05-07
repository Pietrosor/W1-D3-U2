import java.util.ArrayList;
import java.util.List;

public class SIM {
    private String numeroTelefono;
    private double credito;
    private List<Chiamata> ultimeChiamate;


    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.ultimeChiamate = new ArrayList<>();
    }

    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + "€");
        System.out.println("Ultime chiamate effettuate:");

        if (ultimeChiamate.isEmpty()) {
            System.out.println("Nessuna chiamata registrata.");
        } else {
            for (Chiamata chiamata : ultimeChiamate) {
                System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() +
                        ", Durata: " + chiamata.getDurata() + " min");
            }
        }
    }

    public void ricarica(double importo) {
        if (importo > 0) {
            credito += importo;
        } else {
            System.out.println("Importo non valido per la ricarica.");
        }
    }


    public void effettuaChiamata(String numeroChiamato, int durata) {
        if (durata > 0) {
            ultimeChiamate.add(new Chiamata(numeroChiamato, durata));


            if (ultimeChiamate.size() > 5) {
                ultimeChiamate.remove(0);
            }
        } else {
            System.out.println("Durata chiamata non valida.");
        }
    }
}


class Chiamata {
    private String numeroChiamato;
    private int durata;

    public Chiamata(String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }


        public static void main(String[] args) {
            SIM miaSim = new SIM("1234567890");

            miaSim.ricarica(10);
            miaSim.effettuaChiamata("111222333", 5);
            miaSim.effettuaChiamata("444555666", 3);

            miaSim.stampaDatiSIM();
        }

}