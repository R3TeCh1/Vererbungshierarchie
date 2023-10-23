
/**
 *
 * @author David Rischow
 * @version 1.0, 16.10.2023
 *
 */

public abstract class Mitarbeiter implements IMitarbeiter{
  protected String vorname;
  protected String nachname;
  protected float jahresGehaltBisHeute = 0;
  protected VertragsArtT vertragsart;


  /**
   * Konstruktor für einen Mitarbeiter.
   *
   * @param vorname    Der Vorname des Angestellten.
   * @param nachname   Der Nachname des Angestellten.
   */
  public Mitarbeiter(String vorname, String nachname, VertragsArtT vertragsart) {
    this.vorname = vorname;
    this.nachname = nachname;
    this.vertragsart = vertragsart;
  }

  public VertragsArtT getVertragsart() {
    return this.vertragsart;
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

  @Override
  public String toString() {
    String s = "Mitarbeiter{" +
            "vorname='" + this.getVorname() + '\'' +
            ", nachname='" + this.getNachname() + '\'' +
            '}';
    return s;
  }

  /**
   * entgeltBerechnen() wird als abstracte methode definiert, da für jeden Angestellten
   * das Entgelt unterschiedlich berechnet wird.
   */
  public abstract float entgeltBerechnen();
}
