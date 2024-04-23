package circuscharlie.Juegos.CircusCharlie;

import com.entropyinteractive.JGame;

public class App {
    public static JGame frame;

    public String getGreeting() {
        return "Hola mundo!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
    }
}
