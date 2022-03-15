import processing.core.PApplet;
public class ChallengeFourBalls extends PApplet{

        public static final int WIDTH  = 500;
        public static final int HEIGHT = 500;
        public static final int DIAMETER  = 10;

        public static void main(String[] args) {
            PApplet.main("ChallengeFourBalls",args);
        }

        @Override
        public void settings() {
            super.settings();
            size(WIDTH, HEIGHT);
        }

        @Override
        public void draw() {
            super.draw();
            for(int i=0;i<4;i++){
                moveTheBallFromLeftToRight(i);
            }

        }
        public void moveTheBallFromLeftToRight(int index) {
            for(int i=0;i<=WIDTH;i++) {
                ellipse((index+1)*(i+1), (((index + 1) * HEIGHT) / 5), DIAMETER, DIAMETER);
            }

        }
}

