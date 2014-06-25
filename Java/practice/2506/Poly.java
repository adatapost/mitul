public class Poly {
   private Point []pts;
   public Poly() {
      pts = new Point[5];

      pts[0] = new Point(3,5);
      pts[1] = new Point(8,5);
      pts[2] = new Point(8,1);
      pts[3] = new Point(1,1);
      pts[4] = new Point(4,1);
   }
   public int getBase() { return pts[2].getX() - pts[3].getX(); }
   public int getHeight() { return pts[0].getY() - pts[4].getY(); }
   public double getArea() { return getBase()*getHeight()/2.0;}

    public void setPts(Point []v) { pts = v;}
    public Point []getPts() { return pts;}
}