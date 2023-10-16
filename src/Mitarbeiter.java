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
    jahresGehaltBisHeute = 0;
    int aktuellerMonat = new GregorianCalendar().get(Calendar.MONTH);
    for (int month = 0; month < aktuellerMonat; month++) {
      jahresGehaltBisHeute += entgeltBerechnen(month);
    }
    return jahresGehaltBisHeute;
  }

  public abstract float entgeltBerechnen(int aktuellerMonat);

  @Override
  public String toString() {
    return getClass().getSimpleName() + ": " + nachname + ", " + vorname;
  }
}