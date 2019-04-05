/**
  Represent a point, using Cartesian coordinates
 */
public class Point{
    private double xcor;
    private double ycor;

    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer,
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */
        double myDistance = Math.pow((Math.pow(xcor,2) + Math.pow(ycor,2)),(1.0/2.0));
        double otherDistance = Math.pow((Math.pow(((Point)otherObj).xcor,2) + Math.pow(((Point)otherObj).ycor,2)),(1.0/2.0));
        return Double.compare(myDistance,otherDistance);
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")";
    }

}
