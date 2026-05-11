import basis.Knopf;

public class PopUp extends Knopf {
    public PopUp(String name, int x1, int x2, int y1, int y2) {
        super(name, x1, x2, y1, y2);
    }

    public void execute() {
        try {
            // Using xdg-open to open the image in the system's default image viewer
            // which creates a new window pop up as requested.
            new ProcessBuilder("xdg-open", "src/image.jpg").start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
