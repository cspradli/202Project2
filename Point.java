public class Point{
    private final double xCord;
    private final double yCord;

    public Point(double xCord, double yCord){
        this.xCord = xCord;
        this.yCord = yCord;
        
    }
    public double getX(){
        return xCord;
    }

    public double getY(){
        return yCord;
    }

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

    @Override
    public int hashCode(){
        int hash = 11;
        hash = 43 * hash + Double.valueOf(xCord).hashCode();
        hash = 43 * hash + Double.valueOf(yCord).hashCode();
        return hash;
    }

    @Override
    public String toString(){
        return String.format("Point: X Coordinates: %5.8f Y Coordinates: %5.8f\n", xCord, yCord);
    }
}