//https://leetcode.com/problems/maximum-swap/discuss/107073/C%2B%2B-one-pass-simple-and-fast-solution%3A-1-3ms-O(n)-time
class maximumSwap{
	 public static int maximumSwap(int num) {
     	char[] arr = Integer.toString(num).toCharArray();

     	return Integer.parseInt(new String(arr));   
    }
	public static void main(String[] args){
		int n = 2736;
		System.out.println(maximumSwap(n));
	}
}