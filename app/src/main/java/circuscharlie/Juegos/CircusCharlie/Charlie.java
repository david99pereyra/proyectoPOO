package circuscharlie.Juegos.CircusCharlie;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Charlie extends ObjetoGrafico implements ObjetoMovible{

    private boolean onGround = false;
    private boolean saltando = false;

    final int DIRECCION_DERECHA = 0;
	final int DIRECCION_IZQUIERDA = 1;

	final int ESTADO_QUIETO = 1;
	final int ESTADO_CAMINANDO = 0;
	final int ESTADO_ARROJANDO_GRANADA = 4;
	final int ESTADO_MURIENDO = 5;
	int direccionActual;
	int estadoActual;

    protected double velocityX = 4.0;
	protected double velocityY = 0.0;
	protected double gravity = 0.35;
	protected double angulo=0.0;

	protected int direccionAngulo= 1;

	public int PISO;

    private CircusCharlie cc;

    public Charlie(String filename) {
        //super(filename);
        this.cc = new CircusCharlie();
    }
    @Override
    public void update(double delta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
    public void setPISO(int piso){this.PISO = piso;}
    public int getPISO(){return PISO;}
    public void jump(){
        if(onGround){
            velocityY = -12.0;
            onGround = false;
        }
    }

    public void quieto(){estadoActual = ESTADO_QUIETO;}
    public void left(){
        velocityX = -4.0;
        positionX += velocityX;
        direccionActual = DIRECCION_IZQUIERDA;
        estadoActual = ESTADO_CAMINANDO;
        direccionAngulo = -1;
    }
    public void right(){
        velocityX = -4.0;
        positionX += velocityX;
        direccionActual = DIRECCION_DERECHA;
        estadoActual = ESTADO_CAMINANDO;
        direccionAngulo = 1;
    }
    
    public void update(double delta){
        velocityY += gravity;
        positionY += velocityY;

        Mundo m = Mundo.getInstance();

        if((positionX+ (this.getWidth())) > m.getWidth()){
            positionX = m.getWidth() - (this.getWidth());
            velocityX *= -1;
        }

        if (positionX < 0){
            velocityX *= -1  ;
			positionX = 0;
        }

        if(positionY > PISO){
            positionY = PISO;
            velocityY = 0.0;
            onGround = true;
            angulo = 0;
        }
    }

    public void display(Graphics2D g2){
        /*Redefinicion de Display para poder hacer la rotacion cuando salta*/


        // Creo que no es necesario

        AffineTransform transform = new AffineTransform();
        transform.rotate(Math.toRadians(angulo), this.getX() + getWidth()/2, this.getY() + getHeight()/2);

        AffineTransform old = g2.getTransform();
        g2.transform(transform);

        g2.drawImage(imagen, (int) this.positionX, (int) this.positionY, null);

        g2.setTransform(old);
    }
}
