
// https://leetcode-cn.com/problems/three-consecutive-odds/
class L1293_Three_Consecutive_Odds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n % 2 == 0) {
                count = 0;
            } else {
                count++;
                if (count >= 3) {
                    return true;
                }
            }
        }
        return false;
    }
}