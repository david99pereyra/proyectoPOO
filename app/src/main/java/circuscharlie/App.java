package circuscharlie;

public class App {
    public String getGreeting() {
        return "Hola mundo!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        SistemaDeJuego sj = new SistemaDeJuego();
    }
}
