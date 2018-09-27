public class Point{
    private final Double xCord;
    private final Double yCord;

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
        //USE ONCE SUPER CLASS IS MADE
        //if (!super.equals(obj)) return false;
        Point ptn = (Point) obj;
        if (!xCord.equals(ptn.xCord)) return false;
        if (!yCord.equals(ptn.yCord)) return false;
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
        return "X Coordinates: " + xCord + " Y Cords: " + yCord;
    }
}