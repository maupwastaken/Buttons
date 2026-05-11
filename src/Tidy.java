import basis.Knopf;

public class Tidy extends Knopf {
    public Tidy(String name, int x1, int x2, int y1, int y2) {
        super(name, x1, x2, y1, y2);
    }

    public void execute() {
        try {
            // wmctrl -k on toggles "show desktop" mode which minimizes all windows on many Linux desktops including Ubuntu
            Process process = new ProcessBuilder("wmctrl", "-k", "on")
                    .redirectErrorStream(true)
                    .start();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
