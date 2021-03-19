
/**
 * Beschreiben Sie hier die Klasse Schmied.
 * 
 * @author dt
 * @version 0.1
 */
public class Schmied extends Karacter
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Korb lager;
    private Waehrung geld;

    /**
     * Konstruktor für Objekte der Klasse Schmied
     */
    public Schmied()
    {
        // Instanzvariable initialisieren
        super("Hauer",100,1);
        lager = new Korb();
        geld = new Waehrung();
    }

    public void reparieren() {
        Waffe temp = lager.waffeAusgeben();
        temp.setZustand(temp.getZustand()+10);
        geld.verlust(15);
    }
}
