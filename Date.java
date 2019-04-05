/**
  Represent a date
 */
public class Date{
    private int y,m,d;


    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public int compareTo(Object obj){
      return 365*(y - ((Date)obj).y) + 31*(m - ((Date)obj).m) + (d - ((Date)obj).d);
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}
