/**
 *
 * @author Kadir Erzurum
 * @version
 *
 */
public class Angestellter implements IMitarbeiter, ISteuerZahler {
    private float monatsLohn;
    private float ueberStundenTarif;
    private int gearbeiteteUeberstunden;
    private String vorname;
    private String nachname;
    private float jahresGehaltBisHeute;

    public Angestellter(String vorname, String nachname, float monatsLohn, float ueberStundenTarif) {
        this.vorname = vorname;
        this.nachname = nachname;

        if (monatsLohn < IMitarbeiter.mindestLohn * (4 * 40)) {
            System.out.println("Fehler: Monatslohn liegt unter dem Mindestlohn pro Arbeitsstunde.");
        } else {
            this.monatsLohn = monatsLohn;
            this.ueberStundenTarif = ueberStundenTarif;
        }
    }

    @Override
    public float entgeltBerechnen(int aktuellerMonat) {
        if (aktuellerMonat == 1) {
            jahresGehaltBisHeute = 0;
        }
        jahresGehaltBisHeute += monatsLohn * aktuellerMonat + gearbeiteteUeberstunden * ueberStundenTarif;
        return monatsLohn * aktuellerMonat + gearbeiteteUeberstunden * ueberStundenTarif;
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
        float restlichesJahresgehalt = (12 - aktuellerMonat) * monatsLohn;
        return (jahresGehaltBisHeute + restlichesJahresgehalt) * 0.36f;
    }
}
