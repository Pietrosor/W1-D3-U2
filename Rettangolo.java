public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public void stampaRettangolo() {
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1 ");
        r1.stampaRettangolo();

        System.out.println(" Rettangolo 2 ");
        r2.stampaRettangolo();

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma delle Aree: " + sommaAree);
        System.out.println("Somma dei Perimetri: " + sommaPerimetri);
    }
    
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5, 3);
        Rettangolo rettangolo2 = new Rettangolo(6, 8);

        stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}