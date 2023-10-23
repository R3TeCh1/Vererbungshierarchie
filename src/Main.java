import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mitarbeiter> mitarbeiterList = new ArrayList<Mitarbeiter>();
        Mitarbeiter kadir = new Angestellter("Kadir", "", 50000, 500);
        Mitarbeiter david = new ATAngestellter("David", "Rischow", 10000);
        Mitarbeiter nazanin = new Zeitarbeiter("Nazanin", "Golalizadeh", 15);
        mitarbeiterList.add(kadir);
        mitarbeiterList.add(david);
        mitarbeiterList.add(nazanin);
        for (Mitarbeiter mitarbeiter : mitarbeiterList){
            System.out.println("Voraussichtliche Einkommenssteuer ", mitarbeiter.getVorname(), ": ", mitarbeiter.voraussichtlicheEinkommenssteuer());
        }
        for (Mitarbeiter mitarbeiter : mitarbeiterList){
            System.out.println("Tatsächliche Einkommenssteuer ", mitarbeiter.getVorname(), ": ", mitarbeiter.tatsächlicheEinkommenSteuer());
        }
    }

    public static void show(){

    }
}
