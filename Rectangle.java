import java.awt.Color;

public class Rectangle extends Figure{
    boolean vis;
    Point pt;
    public Rectangle( Color color, double xCord, double yCord, double width, double height){
       vis = true;
       BoundingBox bd = new BoundingBox(pt, width, height);
       Point pt = new Point(xCord, yCord);
    }

    @Override
    public double area(){
        return super.gBoundingBox.getUpleft().getX() * super.gBoundingBox.getUpleft().getY();

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
        return super.toString();
    }
}