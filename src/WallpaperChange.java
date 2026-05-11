import basis.Knopf;

public class WallpaperChange extends Knopf {
    public WallpaperChange(String name, int x1, int x2, int y1, int y2) {
        super(name, x1, x2, y1, y2);
    }

    public void execute() {
        try {
            // Ubuntu/GNOME wallpaper change command
            // Assuming the image is at src/wallpaper.jpg
            String imagePath = "file://" + System.getProperty("user.dir") + "/src/wallpaper.jpg";
            Process process = new ProcessBuilder("gsettings", "set", "org.gnome.desktop.background", "picture-uri", imagePath)
                    .redirectErrorStream(true)
                    .start();
            process.waitFor();
            
            // Also set picture-uri-dark for recent Ubuntu versions
            new ProcessBuilder("gsettings", "set", "org.gnome.desktop.background", "picture-uri-dark", imagePath)
                    .start()
                    .waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
