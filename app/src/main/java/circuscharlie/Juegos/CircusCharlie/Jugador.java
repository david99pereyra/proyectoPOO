package circuscharlie.Juegos.CircusCharlie;

public class Jugador {
    private String nombre;
    private int puntuacion;
    private int vidas;
    private int nivel;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.puntuacion = 0;
        this.vidas = 3;
        this.nivel = 1;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void actualizarPuntaje(int puntos){
        puntuacion += puntuacion;
    }

    public void perderVida(){
        vidas--;
    }

    public void avanzarNivel(){
        nivel++;
    }
}
