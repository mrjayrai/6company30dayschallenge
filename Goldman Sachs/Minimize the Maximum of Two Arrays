class Solution {
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {

        int g = divisor1;
        for (int x = divisor2; x > 0; ) {
            int tmp = g;
            g = x;
            x = tmp % x;
        }

        
        long low = 0, high = Integer.MAX_VALUE, mult = ((long) divisor1 * divisor2 / g);

        
        while (low < high) {
            long mid = low + (high - low) / 2;

            
            if (uniqueCnt1 <= mid - mid / divisor1 && uniqueCnt2 <= mid - mid / divisor2 && uniqueCnt1 + uniqueCnt2 <= mid - mid / mult)
                high = mid;
            else
                low = mid + 1;
        }

        return (int) low;
    }
}
