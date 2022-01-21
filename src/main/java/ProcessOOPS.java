import javafx.scene.shape.Circle;
import processing.core.PApplet;

public class ProcessOOPS extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    static int x1 = 0;
    static int x2=0;
    static int x3=0;
    static int x4=0;

    public static void main(String[] args) {
        PApplet.main("ProcessOOPS",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        Ball ball1 = new Ball();
        ball1.setyAxis(HEIGHT/5);
        ball1.setxAxis(x1);
        drawBall(ball1);

        Ball ball2 = new Ball();
        ball2.setyAxis((2*HEIGHT)/5);
        ball2.setxAxis(x2);
        drawBall(ball2);

        Ball ball3 = new Ball();
        ball3.setyAxis((3*HEIGHT)/5);
        ball3.setxAxis(x3);
        drawBall(ball3);

        Ball ball4 = new Ball();
        ball4.setyAxis((4*HEIGHT)/5);
        ball4.setxAxis(x4);
        drawBall(ball4);

        x1+=1;
        x2+=2;
        x3+=3;
        x4+=4;
    }

    public void drawBall(Ball ball){
        ellipse(ball.xAxis,ball.yAxis, ball.diameter, ball.diameter);
    }
}
