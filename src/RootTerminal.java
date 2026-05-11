import basis.Knopf;

public class RootTerminal extends Knopf {
    public RootTerminal(String name, int x1, int x2, int y1, int y2) {
        super(name, x1, x2, y1, y2);
    }

    public void execute() {
        try {
            new ProcessBuilder(
                    "pkexec",
                    "x-terminal-emulator"
            ).redirectErrorStream(true)
                    .start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}