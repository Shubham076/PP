//leetcode 658
import java.util.*;
class findKClosest {
	public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int lo = 0;
        int hi = arr.length - 1;
        while((hi - lo) >= k){
        	if((x - arr[lo]) > (arr[hi] - x)){
        		lo++;
        	}
        	else{
        		hi--;
        	}
        }

        for(int i = lo; i <= hi; i++){
        	ans.add(arr[i]);
        }

        return ans;
    }
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int k = 4, x = 3;
		System.out.println(findClosestElements(arr, k, x));
	}
}