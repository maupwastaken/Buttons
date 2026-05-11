
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
    PopUp popUp;
    Tidy tidy;
    WallpaperChange wallpaperChange;

    public Stiebel() {
        this.initGui();
    }

    public void initGui() {
        this.setzeGroesse(600, 500);
        this.setzeTitel("Stiebel");

        gefahr = new Gefahr("Gefahr", 100, 100, 100, 30);
        popUp = new PopUp("Pop-up", 100, 140, 100, 30);
        tidy = new Tidy("Tidy", 100, 180, 100, 30);
        wallpaperChange = new WallpaperChange("Wallpaper", 100, 220, 100, 30);
    }

    @Override
    public void bearbeiteKnopfDruck(Knopf k) {
        if (k == gefahr) {
            gefahr.execute();
        } else if (k == popUp) {
            popUp.execute();
        } else if (k == tidy) {
            tidy.execute();
        } else if (k == wallpaperChange) {
            wallpaperChange.execute();
        }
    }
}
