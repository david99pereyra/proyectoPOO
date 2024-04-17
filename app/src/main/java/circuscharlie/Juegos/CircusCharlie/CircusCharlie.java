package circuscharlie.Juegos.CircusCharlie;
import circuscharlie.Lanzador.Juego;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.*;

public class CircusCharlie extends Juego{
    private ArrayList<Integer> puntaje_combo;

    public CircusCharlie(){
        setNombre("Circus Charlie");
        setVersion("1.0");
        setDescripcion("Juego sobre un Charlie y sus eventos en el circo");
        setDesarrolladores("PDF, CJ y SF");
        setImagenPortada(new ImageIcon(this.getClass().getResource("/imagenes/juegos/CircusCharlie.png")));
        setImplementado(false);
    }

    @Override
    public void run(double fps) {
    }

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "El juego esta en desarrollo, tenga paciencia a los programadores 👉👈", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    public void calculePuntos(){}
    public void bucle(){}
    public void cargarPantallaPrincipal(){}
    public void cargarPistaMusical(){}
    public void iniciarJuego(){}

}


