import java.awt.Color;

public abstract class Figure{
     BoundingBox gBoundingBox = null;
     Boolean visible = false;
     Color color = null;

    public Figure(BoundingBox gBoundingBox, boolean visible, Color color){
        this.gBoundingBox = gBoundingBox;
        this.visible = visible;
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
    
    public double area(){
        return gBoundingBox.getHeight() * gBoundingBox.getWidth();
    }
    
    public void dilate(double factor){
        //area() = area() * factor;
    }

    public void translate(double horMove, double vertMove){

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
        hash = 23 * hash + visible.hashCode();
        hash = 23 * hash + color.hashCode();
        return hash;
    }

    @Override 
    public String toString(){
        return gBoundingBox.toString() + " Visibility: " + visible + " Color: " + color;
    }    

}