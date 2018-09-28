public class BoundingBox{
    private Point upLeft = null;
    private double width = 0.0;
    private double  height = 0.0;

    public BoundingBox(Point upLeft, double width, double height){
        this.upLeft = upLeft;
        this.width = width;
        this.height = height;
    }

    public Point getUpleft(){
        return upLeft;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        BoundingBox bdb = (BoundingBox) obj;
        if(!upLeft.equals(bdb.upLeft)) return false;
        if(!Double.valueOf(width).equals(bdb.width)) return false;
        if(!Double.valueOf(height).equals(bdb.height)) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int hash = 13;
        hash = 19 * hash + upLeft.hashCode();
        hash = 19 * hash + Double.valueOf(width).hashCode();
        hash = 19 * hash + Double.valueOf(height).hashCode();
        return hash;
    }

    @Override
    public String toString(){
        return "Point: " + upLeft.toString() + " Width:  " + width + " Height: " + height;
    }
}
