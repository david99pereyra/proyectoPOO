package circuscharlie.Juegos.Prueba;

import java.awt.Graphics2D;

import com.entropyinteractive.*;

import circuscharlie.Lanzador.Juego;

public class App extends Juego {

    private static JGame frame;
    @Override
    public void run(double fps) {
        App.frame = new JGame(getDesarrolladores(), 0, 0) {

            @Override
            public void gameDraw(Graphics2D arg0) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'gameDraw'");
            }
    
            @Override
            public void gameShutdown() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'gameShutdown'");
            }
    
            @Override
            public void gameStartup() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'gameStartup'");
            }
    
            @Override
            public void gameUpdate(double arg0) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'gameUpdate'");
            }
            
        };
    }

    @Override
    public void run() {
        
    }

    
    public static JGame getFrame() {
        return frame;
    }   

    
}
