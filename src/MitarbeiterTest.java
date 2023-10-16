import java.util.Scanner;

public class MitarbeiterTest {
  public static void main(String[] args) {
    Zeitarbeiter zeitarbeiter = new Zeitarbeiter("Nazanin", "Golalizadeh", 12.0f, 40);
    ATAngestellter aTAngestellter = new ATAngestellter("Kadir", "Erzurum", 3600.0f);
    Angestellter angestellter = new Angestellter("Oleksandr", "Cherniaiev", 3000.0f, 5.0f);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Bitte geben Sie den aktuellen Monat ein: ");
    int aktuellerMonat = scanner.nextInt();

    Scanner scanner1 = new Scanner(System.in);
    System.out.print("Bitte geben Sie die gearbeiteten Stunden für den Zeitarbeiter ein: ");
    int gearbeiteteStunden = scanner1.nextInt();
    zeitarbeiter.setGearbeiteteStunden(gearbeiteteStunden);

    float zeitarbeiterEntgelt = zeitarbeiter.entgeltBerechnen(aktuellerMonat);
    float aTAngestellterEntgelt = aTAngestellter.entgeltBerechnen(aktuellerMonat);
    float angestellterEntgelt = angestellter.entgeltBerechnen(aktuellerMonat);

    System.out.println("----------------------------------------------------");
    System.out.println(zeitarbeiter.toString());
    System.out.println("Gearbeitete Stunden: " + zeitarbeiter.getGearbeiteteStunden());
    System.out.print("Entgelt: " + zeitarbeiterEntgelt);
    System.out.println("€");
    System.out.println("----------------------------------------------------");
    System.out.println(aTAngestellter.toString());
    System.out.print("Entgelt: " + aTAngestellterEntgelt);
    System.out.println("€");
    System.out.println("----------------------------------------------------");
    System.out.println(angestellter.toString());
    System.out.print("Entgelt: " + angestellterEntgelt);
    System.out.println("€");
  }
}

