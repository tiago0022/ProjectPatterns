package Facade;

public abstract class Figure {
    
    protected String color = "black";
    
    protected void setColor(String color){
        this.color = color;
    }
    
    protected void draw(){
        System.out.println("Drawing figure in the color " + color);
    }
}
