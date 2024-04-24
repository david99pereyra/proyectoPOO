package circuscharlie.Juegos.CircusCharlie;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

import javax.imageio.ImageIO;

public abstract class ObjetoGrafico {
    protected BufferedImage imagen = null;
    private Point2D.Double posicion = new Point2D.Double();
    private Dimension dimensiones;

    public abstract void update(double delta);

    public void setImagen(BufferedImage imagen){
        this.imagen = imagen;
    }

    public BufferedImage getImagen(){
        return imagen;
    }

    public void setPosicionX(double x) {
        this.posicion.x = x;
    }
    public void setPosicionY(double y) {
        this.posicion.y = y;
    }

    public void setDimensiones(Dimension d) {
        this.dimensiones = d;
    }

    public Dimension getDimensiones () {
        return this.dimensiones;
    }
    public Rectangle getRectagle () {
        return new Rectangle((int)this.getX(), (int)this.getY(), this.getDimensiones().width, this.getDimensiones().height);
    }

    public void setDimensiones(int x, int y) {
        this.dimensiones = new Dimension(x, y);
    }

    public void setPosicion(double x, double y) {
        this.posicion.x = x ;
        this.posicion.y = y ;
    }

    public double getX() {return this.posicion.x;}
    public double getY() {return this.posicion.y;}

    public boolean moverHaciaPunto(double x, double y, double delta) {
        double deltaX = x - this.getX();
        double deltaY = y - this.getY();
        double distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        double angulo = Math.atan2(deltaY, deltaX);
        double distanciaMovimiento = 200 * delta; //200 es la velocidad

        if (distanciaMovimiento >= distancia) {
            this.setPosicion(x, y);
            return true;
        } else {
            double movimientoX = distanciaMovimiento * Math.cos(angulo);
            double movimientoY = distanciaMovimiento * Math.sin(angulo);

            double nuevoX = this.getX() + movimientoX;
            double nuevoY = this.getY() + movimientoY;

            this.setPosicion(nuevoX, nuevoY);
            return false;
        }
    }
    
    public void draw(Graphics2D g) {
        if (this.dimensiones != null) g.drawImage(imagen, (int) posicion.getX(), (int) posicion.getY(), this.dimensiones.width, this.dimensiones.height, null);
        else g.drawImage(imagen,(int)posicion.getX(),(int)posicion.getY(),null);
    }
    // public double positionX = 0;
    // public double positionY = 0;

    // private int velocidadX;
    // private int velocidadY;

    // public ObjetoGrafico(String filename){


    //     try {
    //         imagen = ImageIO.read(getClass().getResource(filename));
    //     } catch (Exception e) {
    //         System.out.println(e);
    //     }
    // }

    // public int getWidth(){
    //     return imagen.getWidth();
    // }
    // public int getHeight(){
    //     return imagen.getHeight();
    // }

    // public void setPosition(int x,int y){
    //     this.positionX = x;
    //     this.positionY = y;
    // }

    // public double getX() {
    //     return this.positionX;
    // }

    // public double getY() {
    //     return this.positionY;
    // }

    // public void display(Graphics2D g2){
    //     g2.drawImage(imagen, (int) this.positionX, (int) this.positionY, null);
    // }

    // public int getVelocidadX() {
    //     return this.velocidadX;
    // }
    // public void setVelocidadX(int velocidadX) {
    //     this.velocidadX = velocidadX;
    // }
    // public int getVelocidadY() {
    //     return this.velocidadY;
    // }
    // public void setVelocidadY(int velocidadY) {
    //     this.velocidadY = velocidadY;
    // }

    // public boolean colisiona(){
    //     return true;
    // }

    // public void update(){

    // }
}
