import java.awt.Color;

public class Square extends Rectangle{
    private double sideLength;
    public Square(Color color, Double xCord, Double yCord, Double sideLength){
        super(color, xCord, yCord, sideLength, sideLength);
        this.sideLength = sideLength;
    }

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
        return super.toString() + " Length of Side: " + sideLength;
    }
}