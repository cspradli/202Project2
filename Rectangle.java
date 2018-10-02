/**
 * @author Caleb Spradlin
 * @version Oct 1 2018
 * Project 2
 * A subclass of Figure abstract class, Rectangle is a shape that takes the upperleft point, a width and a height as well as a color
 */

import java.awt.Color;

public class Rectangle extends Figure{
    private double width;
    private double height;

    /**
     * Constructor for Rectangle
     * @param color
     * @param xCord
     * @param yCord
     * @param width
     * @param height
     */
    public Rectangle(Color color, double xCord, double yCord, double width, double height){
        super(xCord, yCord, width, height, color);
        this.height = height;
        this.width = width;
    }
    @Override
    public double area(){
        return width * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Rectangle rct = (Rectangle) obj;
        if (area() != rct.area()) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int hash = 19;
        hash = 31 * hash + super.hashCode();
        return hash;
    }

    @Override
    public String toString(){
        return "Rectangle: " + super.toString();
    }
}