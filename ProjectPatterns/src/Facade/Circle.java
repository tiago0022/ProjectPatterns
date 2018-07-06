package Facade;

public class Circle extends Figure{
    
    Point p1, p2;

    public Circle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing circle in the color " + this.color);
    }
    
}
