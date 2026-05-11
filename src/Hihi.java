import basis.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class Hihi extends Knopf {
    private int breite;
    private int hoehe;

    public Hihi(String name, int x, int y, int w, int h) {
        super(name, x, y, w, h);
        this.breite = w;
        this.hoehe = h;
        
        try {
            // Some versions of basis use a different field name or a getter
            JButton b = null;
            try {
                java.lang.reflect.Field field = Knopf.class.getDeclaredField("knopf");
                field.setAccessible(true);
                b = (JButton) field.get(this);
            } catch (Exception e1) {
                try {
                    java.lang.reflect.Field field = Knopf.class.getDeclaredField("b");
                    field.setAccessible(true);
                    b = (JButton) field.get(this);
                } catch (Exception e2) {
                    for (java.lang.reflect.Field f : Knopf.class.getDeclaredFields()) {
                        if (JButton.class.isAssignableFrom(f.getType())) {
                            f.setAccessible(true);
                            b = (JButton) f.get(this);
                            break;
                        }
                    }
                }
            }

            if (b != null) {
                b.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        teleport();
                    }
                });
            }
        } catch (Exception e) {
        }
    }

    private void teleport() {
        int newX = (int) (Math.random() * (600 - breite));
        int newY = (int) (Math.random() * (500 - hoehe));
        this.setzePosition(newX, newY);
    }
}
