package circuscharlie.Juegos.CircusCharlie;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;

public class Utilidad {
    public static double FRAME_RATE = 60.0;

    public static BufferedImage getImage (String path) {
        try {
            return ImageIO.read(Utilidad.class.getClassLoader().getResourceAsStream(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static File getFile (String path) {
        try {
            return new File("src/main/resources/" + path);
        } catch(Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
