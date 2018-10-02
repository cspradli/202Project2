/**
 * @author Caleb Spradlin
 * @version Oct 1 2018
 * Project 2
 * Abstract class to be implemented by any shape, describes a color,
 * a Bounding Box and wether it is visible. 
 */

import java.awt.Color;

public abstract class Figure{
     private BoundingBox gBoundingBox;
     private boolean visible;
     private Color color;
    /**
     * Makes a point object and BoundingBox object from params, initializes the visibility to true
     * @param xCord
     * @param yCord
     * @param width
     * @param height
     * @param color
     */
    public Figure(double xCord, double yCord, double width, double height, Color color){
        Point pt = new Point(xCord, yCord);
        gBoundingBox = new BoundingBox(pt, width, height);
        visible = true;
        this.color = color;
    }
    /**
     * a void method with no parameters that sets the visibility instance variable to true
     */
    public void makeVisible(){
        visible = true;
    }
    /**
     * a void method with no parameters that sets the visibility instance variable to false
     */
    public void makeInvisible(){
        visible = false;
    }
    /**
     * a void method that takes a Color parameter and sets the color of the figure
     * @param color
     */
    public void setColor(Color color){
        this.color = color;
    }
    /**
     * an abstract method taking no parameters and returning a double representing the area of the figure
     */
    public abstract double area();
    /**
     * a void method taking a double parameter representing a factor by which to increase the area of the figure
     * @param factor
     */
    public void dilate(double factor){
        double newW = gBoundingBox.getWidth() * factor;
        double newH = gBoundingBox.getHeight() * factor;
        Point pt = gBoundingBox.getUpleft();
        gBoundingBox = new BoundingBox(pt, newW, newH);
    }
    /**
     * a void method taking two double parameters representing the distance to move the figure in the horizontal direction and the distance to move the figure in the vertical direction
     */
    public void translate(double horMove, double vertMove){
        double width = gBoundingBox.getWidth();
        double height = gBoundingBox.getHeight();
        double pY = gBoundingBox.getUpleft().getY() + vertMove;
        double pX = gBoundingBox.getUpleft().getX() + horMove;
        Point pt = new Point(pY, pX);
        gBoundingBox = new BoundingBox(pt, width, height);
    }
    /**
     * a static method taking two figures as arguments and returning true if the first figure has a greater area than the second figure
     * @param figureOne
     * @param figureTwo
     * @return Boolean
     */
    public static boolean larger(Figure figureOne, Figure figureTwo){
        if (figureOne.area() > figureTwo.area()) return true;
        return false;
    }
    /**
     * @return boolean
     * method can be used to compare this object to another object
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Figure fgr = (Figure) obj;
        if(!gBoundingBox.equals(fgr.gBoundingBox)) return false;
        if(visible != fgr.visible) return false;
        if(!color.equals(fgr.color)) return false;
        return true;
    }
    /**
     *@return Integer rep of a hashcode
     *Assigns a hash code to the object
     */
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 23 * hash + gBoundingBox.hashCode();
        hash = 23 * hash + Boolean.valueOf(visible).hashCode();
        hash = 23 * hash + color.hashCode();
        return hash;
    }
    /**
     * @return String
     * Returns a string describing the objects variables
     */
    @Override 
    public String toString(){
        return gBoundingBox.toString() + " Visibility: " + visible + " Color: " + color;
    }    

}