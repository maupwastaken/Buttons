import basis.Knopf;

public class Shutdown extends Knopf {
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
