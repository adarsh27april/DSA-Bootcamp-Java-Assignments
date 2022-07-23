package _2_Medium;

public class _8_754_Reach_a_Number {
   public static void main(String[] args) {
      Solution8 ob = new Solution8();
      System.out.println(ob.reachNumber(-1));
   }
}

class Solution8 {
   public int reachNumber_AKS(int target) {

      int i = 0, numMoves = 1;
      target = target > 0 ? target : -1 * target;
      while (true) {
         if (numMoves == (target - i)) {
            return numMoves;
         }
         if (numMoves < (target - i)) {
            i += numMoves;
            ++numMoves;

         } else {// numMoves < (target - i)
            i -= numMoves;
            ++numMoves;
         }
      }
      // return -1;
   }

   public int reachNumber(int target) {
      target = Math.abs(target);
      int step = 0, sum = 0;
      while (sum < target) {
         ++step;
         sum += step;
      }
      while ((sum - target) % 2 != 0) {
         ++step;
         sum += step;
      }
      return step;
   }
}
