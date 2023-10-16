public class Main {
    public static void main(String[] args) {
        Mitarbeiter kadir = new Angestellter("Kadir", "", 50000, 500);
        Mitarbeiter david = new ATAngestellter("David", "Rischow", 10000);
        Mitarbeiter nazanin = new Zeitarbeiter("Nazanin", "Golalizadeh", 15);
        System.out.println(kadir.toString());
        System.out.println();
        System.out.println(kadir.entgeltBerechnen());
        System.out.println(david.toString());
        System.out.println(nazanin.toString());
    }

    public static void show(){

    }
}
