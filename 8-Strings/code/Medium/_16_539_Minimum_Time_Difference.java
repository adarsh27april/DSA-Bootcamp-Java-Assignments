package Medium;

import java.util.*;

public class _16_539_Minimum_Time_Difference {
   public static void main(String[] args) {
      Solution16 ob = new Solution16();

      int minDiff = ob.findMinDifference(Arrays.asList(new String[] {"00:00", "23:59", "02:00"}));
      System.out.println(minDiff);
   }
}


class Solution16 {
   public int findMinDifference(List<String> timePoints) {

      boolean[] mins = new boolean[24 * 60];
      for (String s : timePoints) {
         int x = findMinutes(s);
         if (mins[x] == true)
            return 0;
         else
            mins[x] = true;
      }

      int minTime = -1, maxTime = -1;
      int i = 0;
      while (i < mins.length) {
         if (mins[i] == true) {
            minTime = i;
            break;
         }
         ++i;
      }
      i = mins.length - 1;
      while (i >= 0) {
         if (mins[i] == true) {
            maxTime = i;
            break;
         }
         --i;
      }

      int prevTime = minTime, minDiff = Integer.MAX_VALUE;
      for (i = minTime; i <= maxTime; i++) {
         if (mins[i] == true) {

            minDiff = Math.min(minDiff, (i - prevTime));//i = currentTime
            prevTime = i;
         }
      }
      //till now I am having the minimum time difference of the consecutive times.
      // it could be possible that maxTime and minTime are also close.
      minDiff = Math.min(minDiff, ((24 * 60) - (maxTime - minTime)));

      return minDiff;
   }

   public int findMinutes(String s) {
      String[] str = s.split(":");
      int h = Integer.parseInt(str[0]);
      int m = Integer.parseInt(str[1]);

      return h * 60 + m;// time in min.
   }
}
//Java Linear Time beat 100%
