package circuscharlie.Juegos.CircusCharlie;
import circuscharlie.Lanzador.Juego;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

import com.entropyinteractive.JGame;
import com.entropyinteractive.Keyboard;
import com.google.j2objc.annotations.RetainedWith;

public class CircusCharlie extends Juego{
    private ArrayList<Integer> puntaje_combo;
    private static JGame frame;

    Camara cam;
    Fondo fondo;
    Charlie charlie;
    

    public static void main(String[] args) {
        CircusCharlie game = new CircusCharlie();
        game.run(1.0 / 60.0);
        System.exit(0);
    }
    
    public CircusCharlie(){
        
        //setNombre("Circus Charlie");
        setVersion("1.0");
        setDescripcion("Juego sobre un Charlie y sus eventos en el circo");
        setDesarrolladores("PDF, CJ y SF");
        setImagenPortada(new ImageIcon(this.getClass().getResource("/imagenes/juegos/CircusCharlie.png")));
        setImplementado(false);
    }

    @Override
    public void run(double fps) {
        this.frame = new JGame("CC",800,600) {

            @Override
            public void gameStartup() {
                Mundo m = Mundo.getInstance();
                charlie.setPISO(417);
                charlie.setPosicion(180, charlie.getPISO());

                cam = new Camara(10, 0);
                cam.setRegionVisible(350, 500);

                fondo = new Fondo("resources/imagenes/JuegoCircusCharlie/Generales/FONDO.png");
                m.setLimitesMundo(fondo.getWidth(), fondo.getHeight());
                charlie.quieto();
            }
            
            @Override
            public void gameUpdate(double delta) {
                Keyboard keyboard = getKeyboard();
                if(keyboard.isKeyPressed(KeyEvent.VK_LEFT)){
                    charlie.left();
                }else if (keyboard.isKeyPressed(KeyEvent.VK_RIGHT)){
                    charlie.right();
                }
                LinkedList <KeyEvent> keyEvents = keyboard.getEvents();
                for (KeyEvent event: keyEvents) {
                    if ((event.getID() == KeyEvent.KEY_RELEASED)){
                        charlie.quieto();
                    }
                    if ((event.getID() == KeyEvent.KEY_PRESSED) && (event.getKeyCode() == KeyEvent.VK_SPACE)) {
                        charlie.jump();
                    }
                    if ((event.getID() == KeyEvent.KEY_PRESSED) && (event.getKeyCode() == KeyEvent.VK_ESCAPE)) {
                        stop();
                    }
                }
                charlie.update(delta);
                cam.seguirPersonaje(charlie);
            }

            @Override
            public void gameDraw(Graphics2D g) {
                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                Mundo m = Mundo.getInstance();
                g.translate(cam.getX(), cam.getY());
                fondo.draw(g);
                m.display(g);
                charlie.display(g);
                g.translate(-cam.getX(), -cam.getY());

                g.setColor(Color.red);

                g.drawString("Tecla ESC = Fin del Juego ",490,20);
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


