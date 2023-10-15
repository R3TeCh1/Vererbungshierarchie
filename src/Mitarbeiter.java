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

  public double entgeltBerechnen() {
    return 1.0;
  }

  @Override
  public String toString() {
    String s = "Mitarbeiter{" +
            "vorname='" + this.vorname + '\'' +
            ", nachname='" + this.nachname + '\'' +
            '}';
    return s;
  }
}
