package Facade;

public class GenerateCar implements Shape{
    
    private Figure wheel1, wheel2, lower, upper;

    public GenerateCar(Figure wheel1, Figure wheel2, Figure lower, Figure upper) {
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
        this.lower = lower;
        this.upper = upper;
    }
    
    public void draw(){
        wheel1.draw(); wheel2.draw(); lower.draw(); upper.draw();
    }
}
