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
        if (!super.equals(obj)) return false;
        Point ptn = (Point) obj;
        if(xCord == ptn.xCord && yCord == ptn.yCord) return true;
        return false;
    }

    @Override
    public int hashCode(){
        int hash = 11;
        hash = 43 * hash + Double.valueOf(xCord).hashCode();
        hash = 43 * hash + Double.valueOf(yCord).hashCode();
        return hash;
    }
}