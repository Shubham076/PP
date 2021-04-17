//leetcode 795
public class noOfSubarraysWithBoundedMaximum {
    public static int numSubarrayBoundedMax(int[] A, int L, int R) {
        int ans = 0;
        int i = 0;
        int prevValid = 0;
        for (int j = 0; j < A.length; j++) {
            if (A[j] >= L && A[j] <= R) {
                ans += j - i  + 1;
                prevValid = j - i  + 1;
            } else if (A[j] < L) {
                ans += prevValid;
            } else {
                i = j + 1;
                prevValid = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3};
        int l = 2;
        int r = 3;
        System.out.println(numSubarrayBoundedMax(arr, l , r));
    }
}
