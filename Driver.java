import java.awt.Color;


public class Driver{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(Color.black, 43.53, 32.4, 4.0, 4.0);
        System.out.println(rec.toString());
        System.out.println(rec.area());
        rec.makeInvisible();
        System.out.println(rec.toString());

        Square sq = new Square(Color.blue, 2.0, 4.0, 12.0);
        System.out.println(sq.toString());
        sq.dilate(2);
        System.out.println(sq.toString());

        Ellipse ell = new Ellipse(32.2, 12.0, 6, 4, Color.CYAN);
        Ellipse ellCPY = new Ellipse(32.2, 12.0, 6, 4, Color.CYAN);
        System.out.println(ell.toString());
        System.out.println(ell.area());
        System.out.println(ell.equals(ellCPY));

    }
}