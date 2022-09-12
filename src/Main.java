public class Main {
   public static void main(String[] args) {
      long start = System.currentTimeMillis();

      double x = 3.5, y = 0.27, z = 0, y4 = y * y * y * y;
      for (long k = 1000000000l; k > 0; --k) {
         // z = Math.pow(x, 6) + 2 * Math.pow(x, 5) - 3 * Math.pow(x, 4) + 3.8 * Math.pow(x, 3) + 1.7 * Math.pow(x, 2) + x + 6 + Math.pow(y,4); // 8984
         // z = x * x * x * x * x * x + 2 * x * x * x * x * x - 3 * x * x * x * x + 3.8 * x * x * x + 1.7 * x * x + x + 6 + y * y * y * y; // 16
         z = x * (x * (x * (x * (x * (x + 2) - 3) + 3.8) + 1.7) + 1) + 6 + y4; // 16
         //                                                                                                                     6868
      }

      long finish = System.currentTimeMillis();
      System.out.println(finish - start);
      System.out.println(z);
      // 8984
   }

   /**
    * cbxf  sflbzdkl bjl f
    */
   void task1() {
      //
   }
}