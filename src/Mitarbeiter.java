public abstract class Mitarbeiter{
  private String vorname;
  private String nachname;
  private float jahresGehaltBisHeute = 0;

  public Mitarbeiter(String vorname, String nachname) {
    this.vorname = vorname;
    this.nachname = nachname;
  }

  public String getVorname() {
    return vorname;
  }

  public String getNachname() {
    return nachname;
  }

  public float getJahresGehaltBisHeute() {
    return jahresGehaltBisHeute;
  }

  public double entgeltBerechnen(char operand, double gehalt) {
    if (operand == '+') {
      jahresGehaltBisHeute += gehalt;
      return jahresGehaltBisHeute;
    } else if (operand == '-') {
      jahresGehaltBisHeute -= gehalt;
      return jahresGehaltBisHeute;
    } else {
      return jahresGehaltBisHeute;
    }
  }

  @Override
  public String toString() {
    return "Mitarbeiter{" +
            "vorname='" + vorname + '\'' +
            ", nachname='" + nachname + '\'' +
            '}';
  }
}
