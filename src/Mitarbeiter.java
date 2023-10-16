import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Mitarbeiter{
  protected String vorname;
  protected String nachname;
  protected float jahresGehaltBisHeute;

  public static void main(String[] args) {
    Zeitarbeiter zeitarbeiter = new Zeitarbeiter("Nazanin", "Golalizadeh", 10.0f, 40);
    ATAngestellter aTAngestellter = new ATAngestellter("Kadir", "Erzurum", 3600.0f);
    Angestellter angestellter = new Angestellter("Oleksandr", "Cherniaiev", 3000.0f, 5.0f);

    cal(zeitarbeiter);
    cal(aTAngestellter);
    cal(angestellter);
  }

  public static void cal(Mitarbeiter mitarbeiter) {
    System.out.println("-----------------------------------------");
    if (mitarbeiter instanceof Zeitarbeiter zeitarbeiter) {
      System.out.println(mitarbeiter.toString());
      System.out.println("Monatlich: " + mitarbeiter.entgeltBerechnen() + "€.");
      System.out.println("Gearbeitete Stunden: " + zeitarbeiter.getGearbeiteteStunden());
      System.out.println("Jahresgehalt: " + mitarbeiter.getJahresgehaltBisHeute() + "€");
    } else {
      System.out.println(mitarbeiter.toString());
      System.out.println("Monatlich: " + mitarbeiter.entgeltBerechnen() + "€.");
      System.out.println("Jahresgehalt: " + mitarbeiter.getJahresgehaltBisHeute() + "€");
    }
  }

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

  public float getJahresgehaltBisHeute() {
    jahresGehaltBisHeute = 0;
    GregorianCalendar gCalendar = new GregorianCalendar();
    for (int months = 0; months < gCalendar.get(Calendar.MONTH); months++) {
      jahresGehaltBisHeute += entgeltBerechnen();
    }
    return jahresGehaltBisHeute;
  }

  public abstract float entgeltBerechnen();

  @Override
  public String toString() {
    return getClass().getSimpleName() + ": " + nachname + ", " + vorname;
  }
}