package chapter13.exercise05;

// GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObject implements Comparable<GeometricObject>, Cloneable{
  private String color = "white";
  private boolean filled;

  /**Default construct*/
  protected GeometricObject() {
  }

  /**Construct a geometric object*/
  protected GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  /**Getter method for color*/
  public String getColor() {
    return color;
  }

  /**Setter method for color*/
  public void setColor(String color) {
    this.color = color;
  }

  /**Getter method for filled. Since filled is boolean,
     so, the get method name is isFilled*/
  public boolean isFilled() {
    return filled;
  }

  /**Setter method for filled*/
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /**Abstract method findArea*/
  public abstract double getArea();

  /**Abstract method getPerimeter*/
  public abstract double getPerimeter();

    @Override
    public GeometricObject clone() {
        try {
            return (GeometricObject) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
  public int compareTo(GeometricObject o) {
    return Double.compare(this.getArea(), o.getArea());
  }

  public static GeometricObject max(GeometricObject a, GeometricObject b) {
    if (a.compareTo(b) >= 0)
      return a;
    else
      return b;
  }
}
