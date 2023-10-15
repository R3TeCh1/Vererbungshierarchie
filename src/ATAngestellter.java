import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Die Klasse ATAngestellter repräsentiert einen außertariflichen Angestellten.
 * AT-Angestellte sind Angestellte, deren monatliches Gehalt mindestens 20% über
 * dem höchsten Tarifgehalt liegt.
 *
 * @author Kadir Erzurum
 * @version 1.0, 15.10.2023
 */
public class ATAngestellter extends Mitarbeiter {
  private String vorname;
  private String nachname;
  private float jahresGehaltBisHeute;

  /** Das monatliche Bruttogehalt des AT-Angestellten. */
  private float monatsLohn;

  /** Der Höchstbetrag für das Tarifgehalt. */
  private static final float HOECHSTES_TARIFGEHALT = 5000.0f;

  /**
   * Konstruktor für einen AT-Angestellten.
   *
   * @param vorname    Der Vorname des Angestellten.
   * @param nachname   Der Nachname des Angestellten.
   * @param monatsLohn Das monatliche Bruttogehalt des Angestellten.
   */
  public ATAngestellter(String vorname, String nachname, float monatsLohn) {
    super(vorname, nachname);
    if (monatsLohn >= 1.2 * HOECHSTES_TARIFGEHALT) {
      this.monatsLohn = monatsLohn;
      this.jahresGehaltBisHeute = getJahresGehaltBisHeute();
    } else {
      System.out.println("Monatsgehalt entspricht nicht den AT-Angestellten-Anforderungen.");
    }
    this.vorname = vorname;
    this.nachname = nachname;
  }

  /**
   * Gibt das monatliche Bruttogehalt des AT-Angestellten zurück.
   *
   * @return Das monatliche Bruttogehalt.
   */
  public float getMonatsLohn(){
    return monatsLohn;
  }

  /**
   * Gibt das Jahresgehalt des AT-Angestellten bis zum aktuellen Zeitpunkt zurück.
   *
   * @return Das Jahresgehalt bis heute.
   */
  public float getJahresGehaltBisHeute() {
    return jahresGehaltBisHeute;
  }

  /**
   * Berechnet das monatliche Entgelt des AT-Angestellten.
   * Das Entgelt wird dem Jahresgehalt bis heute hinzugefügt.
   *
   * @return Das berechnete monatliche Entgelt.
   */
  //@Override
  public double entgeltBerechnen() {
    // Überprüfe, ob ein neues Jahr begonnen hat (Januar)
    if (new GregorianCalendar().get(Calendar.MONTH) == Calendar.JANUARY) {
      // Setze das Jahresgehalt am Anfang des neuen Jahres auf 0
      jahresGehaltBisHeute = 0;
    }
    // Addiere den aktuellen Monatslohn zum Jahresgehalt
    jahresGehaltBisHeute += monatsLohn;
    return monatsLohn;
  }

  /**
   * Gibt den Vorname des AT-Angestellten zurück.
   *
   * @return Der Vorname des AT-Angestellten.
   */
  public String getVorname() {
    return vorname;
  }

  /**
   * Gibt den Nachname des AT-Angestellten zurück.
   *
   * @return Der Nachname des AT-Angestellten.
   */
  public String getNachname() {
    return nachname;
  }

  /**
   * Erzeugt eine String-Repräsentation des AT-Angestellten.
   *
   * @return Die String-Repräsentation des AT-Angestellten.
   */
  @Override
  public String toString() {
    return "AT-Angestellter: " + getNachname() + ", " + getVorname();
  }
}
