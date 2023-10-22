/**
 *
 * @author Kadir Erzurum
 * @version
 *
 */
public interface IMitarbeiter {
  float mindestLohn = 12.00f;

  float entgeltBerechnen(int aktuellerMonat);
  String getVorname();
  String getNachname();
  float getJahresgehaltBisHeute();
}
