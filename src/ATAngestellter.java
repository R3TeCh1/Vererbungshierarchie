/**
 * Die Klasse ATAngestellter repräsentiert einen außertariflichen Angestellten.
 * AT-Angestellte sind Angestellte, deren monatliches Gehalt mindestens 20% über
 * dem höchsten Tarifgehalt liegt.
 *
 * @author Kadir Erzurum
 * @version
 */
public class ATAngestellter implements IMitarbeiter {
  private float monatsLohn;
  private String vorname;
  private String nachname;
  private float jahresGehaltBisHeute;

  public ATAngestellter(String vorname, String nachname, float monatsLohn) {
    this.vorname = vorname;
    this.nachname = nachname;
    this.monatsLohn = monatsLohn;
  }

  public float getMonatsLohn(){
    return monatsLohn;
  }

  @Override
  public String getVorname() {
    return vorname;
  }

  @Override
  public String getNachname() {
    return nachname;
  }

  @Override
  public float getJahresgehaltBisHeute() {
    return jahresGehaltBisHeute;
  }

  @Override
  public float entgeltBerechnen(int aktuellerMonat) {
    if (aktuellerMonat == 1) {
      jahresGehaltBisHeute = 0;
    }
    jahresGehaltBisHeute += monatsLohn * aktuellerMonat;
    return monatsLohn * aktuellerMonat;
  }
}