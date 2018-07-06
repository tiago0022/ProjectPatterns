package Facade;

public class Test {

    public static void main(String[] args) {
        GenerateCar GC = new GenerateCar(
                
            new Circle(new Point(9,2), new Point(11, 2)),
            new Circle(new Point(29,2), new Point(31, 2)),
            new Quadrilateral(new Point(0, 5), new Point(40, 5),
                new Point(0, 25), new Point(40, 25)),
            new Quadrilateral(new Point(10, 25), new Point(30, 25),
                new Point(10, 30), new Point(30, 30))
        
        );
        GC.draw();
    }
    
}
