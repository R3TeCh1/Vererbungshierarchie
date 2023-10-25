/**
 *
 * @author Kadir Erzurum, Oleksandr Cherniaiev, David Rischow, Nazanin Golalizadeh
 * @version 2.1
 */
public class Main {
  public static void main(String[] args) {
    int aktuellerMonat = 10; // Setzen Sie den aktuellen Monat auf den gewünschten Wert

    IMitarbeiter[] mitarbeiter = new IMitarbeiter[]{
        new Angestellter("Oleksandr", "Cherniaiev", 3000.0f, 5.0f),
        new ATAngestellter("Kadir", "Erzurum", 3600.0f),
        new Zeitarbeiter("Nazanin", "Golalizadeh", 12.0f, 40)
    };

    for (IMitarbeiter m : mitarbeiter) {
      float aktuellesEntgelt = m.entgeltBerechnen(aktuellerMonat);
      System.out.println("Entgelt von " + m.getVorname() + " " + m.getNachname() + ": " + aktuellesEntgelt + "€");
      System.out.println("Tatsächliche Einkommensteuer: " + ((ISteuerZahler) m).tatsächlicheEinkommenSteuer() + "€");
      System.out.println("Voraussichtliche Einkommensteuer: " + ((ISteuerZahler) m).voraussichtlicheEinkommenSteuer() + "€");
      System.out.println("---------------------------------------------");
    }

    for (IMitarbeiter einzel_mitarbeiter : mitarbeiter){
      System.out.println("Voraussichtliche Einkommenssteuer " + einzel_mitarbeiter.getVorname() + ": " + ((ISteuerZahler) einzel_mitarbeiter).voraussichtlicheEinkommenSteuer());
    }
    for (IMitarbeiter einzel_mitarbeiter : mitarbeiter){
      System.out.println("Tatsächliche Einkommenssteuer " + einzel_mitarbeiter.getVorname() + ": " + ((ISteuerZahler) einzel_mitarbeiter).tatsächlicheEinkommenSteuer());
    }
  }
}