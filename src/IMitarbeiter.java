public interface IMitarbeiter {
    final float mindestLohn = 12;
    String getVorname();
    String getNachname();
    float getJahresGehaltBisHeute();
    float entgeltBerechnen();

    enum VertragsArtT {
        UNBEFRISTET, BEFRISTET, WERKVERTRAG
    }
}