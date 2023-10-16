public class MitarbeiterTest {
  public static void main(String[] args) {
    Zeitarbeiter zeitarbeiter = new Zeitarbeiter("Nazanin", "Golalizadeh", 12.0f, 40);
    ATAngestellter aTAngestellter = new ATAngestellter("Kadir", "Erzurum", 3600.0f);
    Angestellter angestellter = new Angestellter("Oleksandr", "Cherniaiev", 3000.0f, 5.0f);

    int aktuellerMonat = 10;
    angestellter.setGearbeiteteUeberstunden(12);

    float zeitarbeiterEntgelt = zeitarbeiter.entgeltBerechnen(aktuellerMonat);
    float aTAngestellterEntgelt = aTAngestellter.entgeltBerechnen(aktuellerMonat);
    float angestellterEntgelt = angestellter.entgeltBerechnen(aktuellerMonat);

    System.out.println("----------------------------------------------------");
    System.out.println(zeitarbeiter.toString());
    System.out.println("Studenlohn: " + zeitarbeiter.getStundenLohn() + "€");
    System.out.println("Gearbeitete Stunden: " + zeitarbeiter.getGearbeiteteStunden());
    System.out.print("Bis heute erhaltener Gehalt: " + zeitarbeiterEntgelt);
    System.out.println("€");
    System.out.println("----------------------------------------------------");
    System.out.println(aTAngestellter.toString());
    System.out.println("Monatslohn: " + aTAngestellter.getMonatsLohn() + "€");
    System.out.print("Bis heute erhaltener Jahresgehalt: " + aTAngestellterEntgelt);
    System.out.println("€");
    System.out.println("----------------------------------------------------");
    System.out.println(angestellter.toString());
    System.out.println("Monatslohn: " + angestellter.getMonatsLohn() + "€");
    System.out.print("Bis heute erhaltener Jahresgehalt: " + angestellterEntgelt);
    System.out.println("€");
  }
}

