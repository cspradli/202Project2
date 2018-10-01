import java.awt.Color;
import java.lang.Math;

public class Ellipse extends Figure{
    private double majorAx;
    private double minorAx;

    public Ellipse(double xCord, double yCord, double majorAx, double minorAx, Color color){
        super(xCord, yCord, (majorAx*2), (minorAx*2), color);
        this.majorAx = majorAx;
        this.minorAx = minorAx;
    }

    @Override
    public double area(){
        return majorAx * minorAx * Math.PI;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Ellipse ell = (Ellipse) obj;
        if(!Double.valueOf(majorAx).equals(ell.majorAx)) return false;
        if(!Double.valueOf(minorAx).equals(ell.minorAx)) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 11 * hash + super.hashCode();
        hash = 11 * hash + Double.valueOf(majorAx).hashCode();
        hash = 11 * hash + Double.valueOf(minorAx).hashCode();
        return hash;
    }

    @Override
    public String toString(){
        return super.toString() + "Major Axes: " + majorAx + " Minor Axes: " + minorAx + "\n";
    }
}