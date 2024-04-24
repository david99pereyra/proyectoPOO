package circuscharlie.Juegos.CircusCharlie.ObjetosGraficos;

import circuscharlie.Juegos.CircusCharlie.ObjetoGrafico;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import com.google.errorprone.annotations.ForOverride;


public class GrupoDeAros<T> extends ObjetoGrafico {

    private ArrayList<T> aros;
    private Random rand = new Random();

    public GrupoDeAros(){
        TipoAro t = (rand.nextInt(2)>0) ? TipoAro.GRANDE : TipoAro.CHICO;
    }
    private ArrayList<T> getFormacionFila(int x, int y, TipoAro t){
        ArrayList<T> aros = new ArrayList<>();
        
        for (int i = 0; i < new Random().nextInt(50) + 2; i++){
            if (t == TipoAro.CHICO){
                aros.add((T) new AroEnemigoChico(x, (y - 300) + 80 * i));
            }
            else if (t == TipoAro.GRANDE){
                aros.add((T) new AroEnemigoGrande(x, (y - 400) + 80 * i));
            }
        }
        return aros;
    }

    public ArrayList<T> getAros(){
        return aros;
    }

    @Override
    public void update(double delta){
        aros.forEach((ar) -> ((Aro)ar).update(delta));
    }

    @Override
    public void draw (Graphics2D g){
        aros.forEach((ar) -> ((Aro)ar).draw(g));
    }

    
}
