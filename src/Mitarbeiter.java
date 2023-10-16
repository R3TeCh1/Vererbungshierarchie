import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Mitarbeiter{
  protected String vorname;
  protected String nachname;
  protected float jahresGehaltBisHeute;

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
    return this.jahresGehaltBisHeute;
  }

  public abstract float entgeltBerechnen(int aktuellerMonat);

  @Override
  public String toString() {
    return getClass().getSimpleName() + ": " + nachname + ", " + vorname;
  }
}