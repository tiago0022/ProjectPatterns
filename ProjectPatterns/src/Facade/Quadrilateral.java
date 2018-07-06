package Facade;

public class Quadrilateral extends Figure{
    
    Point p1, p2, p3, p4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing quadrilateral in the color " + this.color);
    }
    
}
