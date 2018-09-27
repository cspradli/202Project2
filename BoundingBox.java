public class BoundingBox{
    private Point upLeft = null;
    private Double width = 0.0;
    private Double  height = 0.0;

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
        //USE ONCE SUPER CLASS IS MADE
        //if (!super.equals(obj)) return false;
        BoundingBox bdb = (BoundingBox) obj;
        if (!width.equals(bdb.width)) return false;
        if (!height.equals(bdb.height)) return false;
        return true;
    }
}
