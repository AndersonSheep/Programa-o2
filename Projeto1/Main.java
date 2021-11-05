class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Point p = new Point(10,10);
    p.setX(150);
    System.out.println(p.getX());
    p.moveBy(308, 150);
        System.out.println(p.getX());


  }
}