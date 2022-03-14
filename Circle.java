package lab3;

/**
 * Describe class <code>Circle</code> here.
 *
 * @author <a href="mailto:dcooper@CheyneyCompSci.local">David Cooper</a>
 * @version 1.0
 */
public class Circle {
   private double radius;
   private double scale;
       /**
     * Creates a new <code>Circle</code> instance with the specified radius
     * and a scale of 1
     *
     * @param r - the radius of the circle
     */
    public Circle(double r) {
     radius = r;
     scale = 1.0;
    }
  
    /**
     * reset the scale to 1.0
     *
     */
    public void reset() {
    scale = 1.0;
    }
  
    /**
     * 
     *
     * @return the radius
     */
    public double getRadius() { 
      return scale * radius;
    }
  
    /**
     * compute and return the area of the scaled radius.
     *
     * @return the area of the circle with the scaled radius
     */
    public double getArea() { 
    return  Math.PI * getRadius() * getRadius();
    }
  
    /**
     * compute and return the circumference of the scaled radius.
     *
     * @return a <code>double</code> value
     */
    public double getCircumference() { 
      return 2 * Math.PI * getRadius();     
    }
  
    /**
     * set the scale of the circle.
     *
     * @param d a <code>double</code> value
     */
    public void setScale(double d) {
    scale = d;    
    }
  
}
