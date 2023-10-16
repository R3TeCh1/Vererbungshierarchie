import java.util.Calendar;

/*
 * @author Nazanin Golalizadeh
 * @version 15.10.23
 */
public class Zeitarbeiter extends Mitarbeiter{
    private float stundenLohn;
    private int gearbeiteteStunden;


    public Zeitarbeiter(String vorname, String nachname, float stundenLohn, int gearbeiteteStunden){
        super(vorname, nachname);
        this.stundenLohn = stundenLohn;
        this.gearbeiteteStunden = gearbeiteteStunden;
    }


    //Getter
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    //Methoden
    public float getStundenLohn() {
        return stundenLohn;
    }

    public int getGearbeiteteStunden() {
        return gearbeiteteStunden;
    }

    public void setGearbeiteteStunden(int gearbeiteteStunden) {
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
    public String toString() {
        return "Zeitarbeiter: " + getNachname() + ", " + getVorname();
    }
}
