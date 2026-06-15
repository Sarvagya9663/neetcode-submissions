class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int p : piles) r = Math.max(r, p);
        int res = r;
        while(l <= r) {
            int k = l + (r - l) / 2;
            if (k == 0) {
                l = 1;
                continue;
            }
            long totaltime = 0;
            for ( int p : piles){
                totaltime += Math.ceil((double) p / k);
            }
            if(totaltime <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }

    }
    return res;
        
    }
}
