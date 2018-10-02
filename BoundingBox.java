/**
 * @author Caleb Spradlin
 * @version Oct 1 2018
 * Project 2
 * BoundingBox class takes three params, a Point and two doubles
 * representing the width and height of the bounding box that 
 * encompasses the figure
 */

public class BoundingBox{
    private final Point upLeft;
    private final double width;
    private final double  height;
    /**
     * @param upLeft
     * @param width
     * @param height
     * Constructor for BoundingBox
     */
    public BoundingBox(Point upLeft, double width, double height){
        this.upLeft = upLeft;
        this.width = width;
        this.height = height;
    }
    /**
     * @return upLeft
     * Getter for Point variable
     */
    public Point getUpleft(){
        return upLeft;
    }
    /**
     * @return width
     * Getter for double Width
     */
    public double getWidth(){
        return width;
    }
    /**
     * @return height
     * Getter for double height
     */
    public double getHeight(){
        return height;
    }
    /**
     * @return boolean
     * method can be used to compare this object to another object
     */
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        BoundingBox bdb = (BoundingBox) obj;
        if(!upLeft.equals(bdb.upLeft)) return false;
        if(!Double.valueOf(width).equals(bdb.width)) return false;
        if(!Double.valueOf(height).equals(bdb.height)) return false;
        return true;
    }
     /**
     *@return Integer rep of a hashcode
     *Assigns a hash code to the object
     */
    @Override
    public int hashCode(){
        int hash = 13;
        hash = 19 * hash + upLeft.hashCode();
        hash = 19 * hash + Double.valueOf(width).hashCode();
        hash = 19 * hash + Double.valueOf(height).hashCode();
        return hash;
    }
    /**
     * @return String
     * Returns a string describing the objects variables
     */
    @Override
    public String toString(){
        return upLeft.toString() + " Width:  " + width + " Height: " + height;
    }
}
