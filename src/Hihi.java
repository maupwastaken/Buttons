import basis.*;

public class Hihi extends Knopf implements MausLauscherErweitert {
    private int breite;
    private int hoehe;

    public Hihi(String name, int x, int y, int w, int h) {
        super(name, x, y, w, h);
        this.breite = w;
        this.hoehe = h;
        
        // Register this instance as an extended mouse listener to catch "mouse enter" events
        this.setzeMausLauscherErweitert(this);
    }

    private void teleport() {
        int newX = (int) (Math.random() * (600 - breite));
        int newY = (int) (Math.random() * (500 - hoehe));
        this.setzePosition(newX, newY);
    }

    @Override
    public void bearbeiteMausHinein(Object o, int x, int y) {
        teleport();
    }

    @Override
    public void bearbeiteMausHeraus(Object o, int x, int y) {
        // Not needed
    }

    @Override
    public void bearbeiteMausKlick(Object o, int x, int y) {
        // Not needed
    }

    @Override
    public void bearbeiteMausKlickRechts(Object o, int x, int y) {
        // Not needed
    }

    @Override
    public void bearbeiteDoppelKlick(Object o, int x, int y) {
        // Not needed
    }
}
