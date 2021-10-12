/**
 * Chapter 5 Exercises, pg. 126-127  #7-15
 * 
 * @author Ryan Kulyassa
 * @date 10/4
*/

public class Exercises {

  /*

  7.a. 0
  7.b. 0
  7.c. 5.0
  7.d. 5.0
  7.e. 3
  8.a. 105
  8.b. 19.0
  9. count += (total/pages - 5) * words - 1;
  10. On line 4, convert one of the integers to a double (1 to 1.0 or 2 to 2.0)
  
  */

  // 11
  public static int roundDown(double x) {
    return (int)x-1;
  }

  // 13.
  public static void roots(int a, int b, int c) {
    double d = Math.sqrt(b*b - 4*a*c);
    double pos = (-b + d)/2*a;
    double neg = (-b - d)/2*a;
    System.out.println(pos);
    System.out.println(neg);
  }

  // 14. Cannot set double value for int, vice versa

  // 15
  public static int swapDigits(int n) {
    int r = 0;
    while (n != 0) {
      int d = n % 10;
      r = r * 10 + d;
      n /= 10;
    }
    return r;
  }

  public static void main(String[] args) {
    roots(6, -17, 12);
  }
}