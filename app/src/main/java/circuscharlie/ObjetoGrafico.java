package circuscharlie;

import java.awt.Image;

public class ObjetoGrafico {
    private int EjeX;
    private int EjeY;
    private int velocidadX;
    private int velocidadY;
    private Image imagen;


    public int getEjeX() {
        return this.EjeX;
    }

    public void setEjeX(int EjeX) {
        this.EjeX = EjeX;
    }

    public int getEjeY() {
        return this.EjeY;
    }

    public void setEjeY(int EjeY) {
        this.EjeY = EjeY;
    }

    public int getVelocidadX() {
        return this.velocidadX;
    }

    public void setVelocidadX(int velocidadX) {
        this.velocidadX = velocidadX;
    }

    public int getVelocidadY() {
        return this.velocidadY;
    }

    public void setVelocidadY(int velocidadY) {
        this.velocidadY = velocidadY;
    }

    public Image getImagen() {
        return this.imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public void mover(){

    }

    public boolean colisiona(){
        return true;
    }

    public void draw(Image imagen){

    }

    public void update(){

    }
}
