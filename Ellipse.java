import java.awt.Color;
import java.lang.Math;

public class Ellipse extends Figure{
    double majorAx;
    double minorAx;
    public Ellipse(double xCords, double yCords, double majorAx, double minorAx, Color color){
        this.majorAx = majorAx;
        this.minorAx = minorAx;
    }

    @Override
    public double area(){
        return majorAx * minorAx * Math.PI;
    }
}