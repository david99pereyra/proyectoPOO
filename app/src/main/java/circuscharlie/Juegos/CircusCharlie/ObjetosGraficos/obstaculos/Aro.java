package circuscharlie.Juegos.CircusCharlie.ObjetosGraficos.obstaculos;

import circuscharlie.Juegos.CircusCharlie.ObjetoGrafico;

import java.awt.*;
import java.awt.image.BufferedImage;


public abstract class Aro extends ObjetoGrafico{
    public static final int ARO_DESPLAZAMIENTO_NORMAL = 300; //Velocidad de desplazamiento
    protected int velDesplazamiento = ARO_DESPLAZAMIENTO_NORMAL; //Velocidad de desplazamiento

    public void setDesplazamiento (int vel){
        this.velDesplazamiento = vel;
    }
    
    int getDesplazamiento(){
        return this.velDesplazamiento;
    }
}
