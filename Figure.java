import java.awt.Color;

public abstract class Figure{
     private BoundingBox gBoundingBox;
     private boolean visible;
     private Color color;

    public Figure(double xCord, double yCord, double width, double height, Color color){
        Point pt = new Point(xCord, yCord);
        gBoundingBox = new BoundingBox(pt, width, height);
        visible = true;
        this.color = color;
    }

    public void makeVisible(){
        visible = true;
    }

    public void makeInvisible(){
        visible = false;
    }

    public void setColor(Color color){
        this.color = color;
    }
    
    public abstract double area();
    
    public void dilate(double factor){
        double newW = gBoundingBox.getWidth() * factor;
        double newH = gBoundingBox.getHeight() * factor;
        Point pt = gBoundingBox.getUpleft();
        gBoundingBox = new BoundingBox(pt, newW, newH);
    }

    public void translate(double horMove, double vertMove){
        double width = gBoundingBox.getWidth();
        double height = gBoundingBox.getHeight();
        double pY = gBoundingBox.getUpleft().getY() + vertMove;
        double pX = gBoundingBox.getUpleft().getX() + horMove;
        Point pt = new Point(pY, pX);
        gBoundingBox = new BoundingBox(pt, width, height);
    }

    public static boolean larger(Figure figureOne, Figure figureTwo){
        if (figureOne.area() > figureTwo.area()) return true;
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Figure fgr = (Figure) obj;
        if(!gBoundingBox.equals(fgr.gBoundingBox)) return false;
        if(visible != fgr.visible) return false;
        if(!color.equals(fgr.color)) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 23 * hash + gBoundingBox.hashCode();
        hash = 23 * hash + Boolean.valueOf(visible).hashCode();
        hash = 23 * hash + color.hashCode();
        return hash;
    }

    @Override 
    public String toString(){
        return gBoundingBox.toString() + "Visibility: " + visible + " Color: " + color + "\n";
    }    

}