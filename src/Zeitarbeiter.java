/*
 * @author Nazanin Golalizadeh
 * @version
 */
public class Zeitarbeiter implements IMitarbeiter {
    private float stundenLohn;
    private int gearbeiteteStunden;
    private String vorname;
    private String nachname;
    private float jahresGehaltBisHeute;

    public Zeitarbeiter(String vorname, String nachname, float stundenLohn, int gearbeiteteStunden) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.stundenLohn = stundenLohn;
        this.gearbeiteteStunden = gearbeiteteStunden;
    }

    @Override
    public String getVorname() {
        return vorname;
    }

    @Override
    public String getNachname() {
        return nachname;
    }

    public float getStundenLohn() {
        return stundenLohn;
    }

    public int getGearbeiteteStunden() {
        return gearbeiteteStunden;
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
        float entgelt = gearbeiteteStunden * stundenLohn;
        jahresGehaltBisHeute += entgelt;
        return entgelt;
    }
}
