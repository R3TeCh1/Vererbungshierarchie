/*
 * @author Kadir Erzurum
 * @version
 */
public class Zeitarbeiter implements IMitarbeiter, ISteuerZahler {
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
    public float entgeltBerechnen(int aktuellerMonat) {
        if (aktuellerMonat == 1) {
            jahresGehaltBisHeute = 0;
        }
        float entgelt = gearbeiteteStunden * stundenLohn;
        jahresGehaltBisHeute += entgelt;
        return entgelt;
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
    public float tatsächlicheEinkommenSteuer() {
        return jahresGehaltBisHeute * 0.36f; // Einkommensteuersatz von 36%
    }

    @Override
    public float voraussichtlicheEinkommenSteuer() {
        float restlichesJahresgehalt = (12 - aktuellerMonat) * (gearbeiteteStunden * stundenLohn);
        return (jahresGehaltBisHeute + restlichesJahresgehalt) * 0.36f;
    }
}
