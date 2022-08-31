package Facade;

public class FacadePatternDemo {
    public static void main(String[] args){
        ShapeMaker shapeMaker=new ShapeMaker();
        shapeMaker.drawCricle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
