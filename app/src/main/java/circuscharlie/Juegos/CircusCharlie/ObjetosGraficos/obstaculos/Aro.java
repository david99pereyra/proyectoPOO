package circuscharlie.Juegos.CircusCharlie.ObjetosGraficos.obstaculos;

import circuscharlie.Juegos.CircusCharlie.ObjetoGrafico;

import java.awt.*;
import java.awt.image.BufferedImage;


public abstract class Aro extends ObjetoGrafico{
<<<<<<< HEAD:app/src/main/java/circuscharlie/Juegos/CircusCharlie/ObjetosGraficos/obstaculos/Aro.java
    public static final int ARO_DESPLAZAMIENTO_NORMAL = 300; //Velocidad de desplazamiento
    protected int velDesplazamiento = ARO_DESPLAZAMIENTO_NORMAL; //Velocidad de desplazamiento
=======
    public static final int ARO_DESPLAZAMIENTO_NORMAL = 300;
    protected int velDesplazamiento = ARO_DESPLAZAMIENTO_NORMAL;
    
    public Aro(String filename) {
       // super(filename);
        //TODO Auto-generated constructor stub
    }
>>>>>>> Develop:app/src/main/java/circuscharlie/Juegos/CircusCharlie/ObjetosGraficos/Aro.java

    public void setDesplazamiento (int vel){
        this.velDesplazamiento = vel;
    }
    
    int getDesplazamiento(){
        return this.velDesplazamiento;
    }
}
