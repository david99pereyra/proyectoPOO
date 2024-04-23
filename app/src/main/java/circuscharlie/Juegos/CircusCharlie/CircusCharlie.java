package circuscharlie.Juegos.CircusCharlie;
import circuscharlie.Lanzador.Juego;

import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.*;

import com.entropyinteractive.JGame;

public class CircusCharlie extends Juego{
    private ArrayList<Integer> puntaje_combo;
    private static JGame frame;
    
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
        App.frame = new JGame(getDesarrolladores(),0,0) {

            @Override
            public void gameStartup() {
                
            }
            
            @Override
            public void gameUpdate(double arg0) {
                
            }

            @Override
            public void gameDraw(Graphics2D arg0) {
                
            }

            @Override
            public void gameShutdown() {
                
            }

            
            
        };
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


