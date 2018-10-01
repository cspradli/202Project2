public class Circle extends Ellipse{
    private double radius;
    public Circle(double xCord, double yCord, double radius, Color color){
        super(xCord, yCord, radius, radius, color);
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Circle crc = (Circle) obj;
        if(!Double.valueOf(radius).equals(crc.radius)) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int hash = 29;
        hash = 47 * hash + super.hashCode();
        hash = 47 * hash + Double.valueOf(radius).hashCode();
        return hash;
    }

    @Override
    public String toString(){
        return super.toString() + "Radius: " + radius;
    }
}