public class Driver{
    public static void main(String[] args) {
        Point pt = new Point(43.1, 45.75);
        Point pt1 = new Point(43.1, 45.75);

        System.out.println(pt.equals(pt1));
        System.out.println(pt.hashCode());
        System.out.println(pt1.hashCode());
        System.out.println(pt1.toString());

        BoundingBox bd = new BoundingBox(pt1, 12.4, 17.5);
        BoundingBox bd1 = new BoundingBox(pt1, 12.4, 17.5);
        System.out.println(bd.getHeight() + " ");
        System.out.println(bd.getWidth() + " ");
        System.out.println(bd.equals(bd1));
        System.out.println(bd.hashCode());
        System.out.println(bd1.hashCode());
        System.out.println(bd.toString());

    }
}