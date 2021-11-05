public class Point {
    private int x = 0, y = 0;

    public int getX() { 
      return x; 
    }
    public int getY() { 
      return y; 
    }

    public void setX(int x) { 
        this.x = x; 
    }
    public void setY(int y) { 
        this.y = y; 
    }

    public void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
}