/*
* @author Nazanin Golalizadeh
* @version 15.10.23
 */


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zeitarbeiter extends Mitarbeiter{

    private String vorname;
    private String nachname;
    private float jahresGehaltBisHeute;
    private float stundenLohn;
    private int gearbeiteteStunden;


    public Zeitarbeiter(String vorname, String nachname, float stundenLohn){
        super(vorname, nachname);
        this.vorname = vorname;
        this.nachname = nachname;
        this.stundenLohn = stundenLohn;
        this.gearbeiteteStunden = 0;
    }


    //Methoden

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public float getJahresGehaltBisHeute() {
        return jahresGehaltBisHeute;
    }

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
        Calendar calendar = new GregorianCalendar();
        if (calendar.get(Calendar.MONTH) + 1 == aktuellerMonat) {
            float entgelt = stundenLohn * gearbeiteteStunden * aktuellerMonat;
            jahresGehaltBisHeute += entgelt;
            return entgelt;
        } else {
            return 0;
        }
    }




    @Override
    public String toString() {
        return "Zeitarbeiter: " + getNachname() + ", " + getVorname();
    }
}
