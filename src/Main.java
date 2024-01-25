//Scrivere un programma che contenga una classe astratta chiamata Forma
// ed un metodo astratto chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma
//ed implementano il metodo per il calcolo dell'area in maniera specifica.

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(5,5);
        Triangolo triangolo= new Triangolo(5,5);

        System.out.println("Il " + rettangolo + " ha un area di: " + rettangolo.calcolaArea());
        System.out.println("Il " + triangolo + " ha un area di: " + triangolo.calcolaArea());
    }
}