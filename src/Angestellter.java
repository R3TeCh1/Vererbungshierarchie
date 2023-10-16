import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Oleksandr Cherniaiev
 * @version 1.0, 16.10.2023
 *
 */

public class Angestellter extends Mitarbeiter{
    private float monatsLohn;
    private float uberStundenTarif;
    private int gearbeiteteUberstunden;

    public Angestellter(String vorname, String nachname, float monatsLohn, float uberStundenTarif){
        super(vorname,nachname);
        this.monatsLohn = monatsLohn;
        this.uberStundenTarif = uberStundenTarif;
    }

    public float getMonatsLohn() {
        return monatsLohn;
    }

    public float getUberStundenTarif() {
        return uberStundenTarif;
    }

    public int getGearbeiteteUberstunden() {
        return gearbeiteteUberstunden;
    }

    public void setGearbeiteteUberstunden(int gearbeiteteUberstunden) {
        this.gearbeiteteUberstunden = gearbeiteteUberstunden;
    }

    public float entgeltBerechnen() {
        if (new GregorianCalendar().get(Calendar.MONTH) == Calendar.JANUARY) {
            // Setze das Jahresgehalt am Anfang des neuen Jahres auf 0
            jahresGehaltBisHeute = 0;
        }
        float entgelt = monatsLohn + uberStundenTarif * gearbeiteteUberstunden;
        jahresGehaltBisHeute += entgelt;

        return entgelt;
    }

    @Override
    public String toString() {
        return "Angestellter: " + getNachname() + ", " + getVorname();
    }

}
