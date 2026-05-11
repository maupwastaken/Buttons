
/**
 * Klasse Stiebel
 * <p>
 * Roland Stiebel
 * version 1.0
 */

//Import

import basis.*;

import java.awt.*;

public class Stiebel extends Fenster implements KnopfLauscher {
    Gefahr gefahr;
    Hihi hihi;

    public Stiebel() {
        this.initGui();
    }

    public void initGui() {
        this.setzeGroesse(600, 500);
        this.setzeTitel("Stiebel");

        gefahr = new Gefahr("Gefahr", 100, 100, 100, 30);
        gefahr.setzeKnopfLauscher(this);

        hihi = new Hihi("hihi", 250, 200, 100, 30);
        hihi.setzeKnopfLauscher(this);
    }

    @Override
    public void bearbeiteKnopfDruck(Knopf k) {
        if (k == gefahr) {
            gefahr.execute();
        } else if (k == hihi) {
            hihi.setzeText("Haha!");
        }
    }
}
