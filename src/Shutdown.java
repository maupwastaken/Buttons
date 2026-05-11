import basis.Knopf;

public class Shutdown extends Knopf {
    public Shutdown(String name, int x1, int x2, int y1, int y2) {
        super(name, x1, x2, y1, y2);
    }

    public void execute() {
        try {
            Process process = new ProcessBuilder("systemctl", "poweroff")
                    .redirectErrorStream(true)
                    .start();

            int exitCode = process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
