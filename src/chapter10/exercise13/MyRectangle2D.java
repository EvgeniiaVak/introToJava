package chapter10.exercise13;

public class MyRectangle2D {
    private double x, y; //for center
    private double width, height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public boolean overlaps(MyRectangle2D r) {
        double halfHeightSum = height / 2 + r.height / 2;
        double distanceY = Math.abs(y - r.y);
        boolean vertically = halfHeightSum >= distanceY;

        double halfWidthSum = width / 2 + r.width / 2;
        double distanceX = Math.abs(x - r.x);
        boolean horizontally = halfWidthSum >= distanceX;

        return vertically && horizontally;
    }

    public boolean contains(MyRectangle2D r) {
//        if (r.width > width || r.height > height)
//            return false;

        double right = this.x + width / 2;
        double left = this.x - width / 2;
        double top = this.y + width / 2;
        double bottom = this.y - width / 2;

        double rightSmall = r.x + r.width / 2;
        double leftSmall = r.x - r.width / 2;
        double topSmall = r.y + r.width / 2;
        double bottomSmall = r.y - r.width / 2;

        return right >= rightSmall && left <= leftSmall &&
                top >= topSmall && bottom <= bottomSmall;
    }

    public boolean contains(double x, double y) {
        double right = this.x + width / 2;
        double left = this.x - width / 2;
        double top = this.y + width / 2;
        double bottom = this.y - width / 2;


        return x <= right && x >= left &&
                y <= top && y >= bottom;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public double getArea() {
        return width * height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
