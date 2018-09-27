public static class BoundingBox{
    private Point upLeft = null;
    private double width = 0;
    private double  height = 0;
    public BoundingBox(Point upLeft, double width, double height){
        this.upLeft = upLeft;
        this.width = width;
        this.height = height;
    }

}