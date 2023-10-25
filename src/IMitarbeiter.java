/**
 *
 * @author Kadir Erzurum, Oleksandr Cherniaiev, David Rischow, Nazanin Golalizadeh
 * @version 2.1
 */
public interface IMitarbeiter {

  float mindestLohn = 12.00f;

  float entgeltBerechnen(int aktuellerMonat);
  String getVorname();
  String getNachname();
  float getJahresgehaltBisHeute();
  VertragsArtT getVertragsart(); // Methode, um die Vertragsart abzurufen
  void setVertragsart(VertragsArtT vertragsart);
}
