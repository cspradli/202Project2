/**
 * @author Caleb Spradlin
 * @version Oct 1 2018
 * Project 2
 * Subclass of Rectangle, both the width and height are described by the sidelength param
 */

import java.awt.Color;

public class Square extends Rectangle{
    private double sideLength;

    /**
     * Constructor for Square
     * @param color
     * @param xCord
     * @param yCord
     * @param sideLength
     */
    public Square(Color color, Double xCord, Double yCord, Double sideLength){
        super(color, xCord, yCord, sideLength, sideLength);
        this.sideLength = sideLength;
    }
    /**
     * Getter for sideLength variable
     * @return sideLength
     */
    public double getSide(){
        return sideLength;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Square rct = (Square) obj;
        if (!Double.valueOf(sideLength).equals(rct.sideLength)) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int hash = 23;
        hash = 37 * hash + super.hashCode();
        hash = 37 * hash + Double.valueOf(sideLength).hashCode();
        return hash;
    }

    @Override
    public String toString(){
        return "Square: " + super.toString() + " Length of Side: " + sideLength;
    }
}