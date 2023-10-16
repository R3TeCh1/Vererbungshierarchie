import java.util.Calendar;

/**
 *
 * @author Oleksandr Cherniaiev
 * @version 1.0, 16.10.2023
 *
 */

public class Angestellter extends Mitarbeiter{
    private float monatsLohn;
    private float ueberStundenTarif;
    private int gearbeiteteUeberstunden;

    public Angestellter(String vorname, String nachname, float monatsLohn, float ueberStundenTarif){
        super(vorname,nachname);
        this.monatsLohn = monatsLohn;
        this.ueberStundenTarif = ueberStundenTarif;
    }

    public float getMonatsLohn() {
        return monatsLohn;
    }

    public float getUeberStundenTarif() {
        return ueberStundenTarif;
    }

    public int getGearbeiteteUeberstunden() {
        return gearbeiteteUeberstunden;
    }

    public void setGearbeiteteUeberstunden(int gearbeiteteUeberstunden) {
        this.gearbeiteteUeberstunden = gearbeiteteUeberstunden;
    }

    @Override
    public float entgeltBerechnen(int aktuellerMonat) {
        if (aktuellerMonat == 1) {
            jahresGehaltBisHeute = 0;
        }
        jahresGehaltBisHeute += (monatsLohn + gearbeiteteUeberstunden * ueberStundenTarif) * aktuellerMonat;
        return (monatsLohn + gearbeiteteUeberstunden * ueberStundenTarif) * aktuellerMonat;
    }

    @Override
    public String toString() {
        return "Angestellter: " + getNachname() + ", " + getVorname();
    }
}
