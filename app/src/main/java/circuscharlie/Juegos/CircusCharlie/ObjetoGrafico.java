package circuscharlie.Juegos.CircusCharlie;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

import javax.imageio.ImageIO;

public class ObjetoGrafico {
    protected BufferedImage imagen = null;
    
    public double positionX = 0;
    public double positionY = 0;

    private int velocidadX;
    private int velocidadY;

    public ObjetoGrafico(String filename){
        try {
            imagen = ImageIO.read(getClass().getResource(filename));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getWidth(){
        return imagen.getWidth();
    }
    public int getHeight(){
        return imagen.getHeight();
    }

    public void setPosition(int x,int y){
        this.positionX = x;
        this.positionY = y;
    }

    public double getX() {
        return this.positionX;
    }

    public double getY() {
        return this.positionY;
    }

    public void display(Graphics2D g2){
        g2.drawImage(imagen, (int) this.positionX, (int) this.positionY, null);
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

    public boolean colisiona(){
        return true;
    }

    public void update(){

    }
}
