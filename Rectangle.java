public class Rectangle extends Figure{

    public Rectangle(boolean visible, Color color, double xCord, double yCord, double width, double height){
        super(bd, width, height, visible, color);
        Point pt = new Point(xCord, yCord);
        BoundingBox bd = new BoundingBox(pt, width, height);
    }

    @Override
    public double area(){
        return pt.xCord * pt.yCord;
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