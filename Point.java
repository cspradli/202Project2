/**
 * @author Caleb Spradlin
 * @version Oct 1 2018
 * Project 2
 * Point class holds two instance variables, the X coordinate
 * and the Y coordinate that will represent the upper left corner of 
 * the bounding box of the figure
 */

public class Point{
    private final double xCord;
    private final double yCord;
    /**
     * @param xCord
     * @param yCord
     * Constructor for Point class
     */
    public Point(double xCord, double yCord){
        this.xCord = xCord;
        this.yCord = yCord;
        
    }
    /**
     * @return xCord
     * Getter for X Coordinate
     */
    public double getX(){
        return xCord;
    }
    /**
     * @return yCord
     * Getter for Y Coordinate
     */
    public double getY(){
        return yCord;
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
        Point ptn = (Point) obj;
        if(!Double.valueOf(xCord).equals(ptn.xCord)) return false;
        if(!Double.valueOf(yCord).equals(ptn.yCord)) return false;
        return true;
    }
    /**
     *@return Integer rep of a hashcode
     *Assigns a hash code to the object
     */
    @Override
    public int hashCode(){
        int hash = 11;
        hash = 43 * hash + Double.valueOf(xCord).hashCode();
        hash = 43 * hash + Double.valueOf(yCord).hashCode();
        return hash;
    }
    /**
     * @return String
     * Returns a string describing the objects variables
     */
    @Override
    public String toString(){
        return " X Coordinates:  "+ xCord+ "  Y Coordinates: "+ yCord;
    }
}