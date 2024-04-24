package circuscharlie.Juegos.CircusCharlie.ObjetosGraficos;

import circuscharlie.Juegos.CircusCharlie.ObjetoGrafico;

public abstract class Aro extends ObjetoGrafico{
    public static final int ARO_DESPLAZAMIENTO_NORMAL = 300;
    protected int velDesplazamiento = ARO_DESPLAZAMIENTO_NORMAL;
    
    public Aro(String filename) {
       // super(filename);
        //TODO Auto-generated constructor stub
    }

    public void setDesplazamiento (int vel){
        this.velDesplazamiento = vel;
    }
    
    int getDesplazamiento(){
        return this.velDesplazamiento;
    }
    
}
