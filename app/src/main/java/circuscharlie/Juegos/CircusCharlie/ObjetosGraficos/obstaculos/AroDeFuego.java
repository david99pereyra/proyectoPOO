package circuscharlie.Juegos.CircusCharlie.ObjetosGraficos.obstaculos;
import java.awt.*;
import java.awt.image.BufferedImage;

import circuscharlie.Juegos.CircusCharlie.Utilidad;

public class AroDeFuego extends Aro{
    private BufferedImage imgPrimeraGrande, imgSegundaGrande, imgPrimeraChica, imgSegundaChica; //Crear imagen
   

    public AroDeFuego(int posX, int posY){
        // imgPrimeraGrande = Utilidad.getImage();  
        // imgSegundaGrande = Utilidad.getImage();
        // imgPrimeraChica = Utilidad.getImage();
        // imgSegundaChica = Utilidad.getImage()

        this.setPosicion(posX, posY);
        this.setDimensiones(new Dimension(80, 40));
        setDesplazamiento(400);
    }

    @Override
    public void update(double delta){
        setImagen(imgPrimeraGrande);
        setPosicionX(getX() + getDesplazamiento() * delta);
    }
}
