import java.awt.Color;

public class Square extends Rectangle{
    private double sideLength;
    public Square(Double xCord, Double yCord, Double sideLength, Color color, boolean visible){
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
}