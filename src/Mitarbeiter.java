import java.util.Scanner;

public abstract class Mitarbeiter{
  protected String vorname;
  protected String nachname;
  protected float jahresGehaltBisHeute = 0;

  public Mitarbeiter(String vorname, String nachname) {
    this.vorname = vorname;
    this.nachname = nachname;
  }

  public String getVorname() {
    return this.vorname;
  }

  public String getNachname() {
    return this.nachname;
  }

  public float getJahresGehaltBisHeute() {
    return this.jahresGehaltBisHeute;
  }

  public abstract float entgeltBerechnen(int aktuellerMonat);

  @Override
  public String toString() {
    String s = "Mitarbeiter{" +
            "vorname='" + this.vorname + '\'' +
            ", nachname='" + this.nachname + '\'' +
            '}';
    return s;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bitte geben Sie den aktuellen Monat ein (1-12): ");
    int aktuellerMonat = scanner.nextInt();

    Zeitarbeiter zeitarbeiter = new Zeitarbeiter("Nazanin", "Golalizadeh", 10.0f);
    ATAngestellter aTAngestellter = new ATAngestellter("Kadir", "Erzurum", 6000.0f);
    Angestellter angestellter = new Angestellter("Oleksandr", "Cherniaiev", 3000.0f, 5.0f);

    float zeitarbeiterEntgelt = zeitarbeiter.entgeltBerechnen(aktuellerMonat);
    float aTAngestellterEntgelt = aTAngestellter.entgeltBerechnen(aktuellerMonat);
    float angestellterEntgelt = angestellter.entgeltBerechnen(aktuellerMonat);

    System.out.println("---------------------------------------------------------------------");
    System.out.println(zeitarbeiter.toString());
    System.out.println("Monatsgehalt: " + zeitarbeiterEntgelt);
    System.out.println("Jahresgehalt bis heute: " + zeitarbeiter.getJahresGehaltBisHeute());

    System.out.println("---------------------------------------------------------------------");
    System.out.println(aTAngestellter.toString());
    System.out.println("Monatsgehalt: " + aTAngestellterEntgelt);
    System.out.println("Jahresgehalt bis heute: " + aTAngestellter.getJahresGehaltBisHeute());

    System.out.println("---------------------------------------------------------------------");
    System.out.println(angestellter.toString());
    System.out.println("Monatsgehalt: " + angestellterEntgelt);
    System.out.println("Jahresgehalt bis heute: " + angestellter.getJahresGehaltBisHeute());
  }
}