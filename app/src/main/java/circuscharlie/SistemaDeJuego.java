package circuscharlie;

import java.util.ArrayList;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 
public class SistemaDeJuego extends JFrame implements ActionListener{
    private Juego seleccionDeJuego;
    private ArrayList<Juego> juegosDisponibles; 
    private final int ANCHO = 800, ALTO = 600;

    public SistemaDeJuego(){
        setTitle("CircusCharlie");
        setSize(ANCHO, ALTO);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    void MostrarMenu(){}
    void seleccionarJuego(){}
    void iniciarJuego(){}
    void descargarJuego(){}

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
