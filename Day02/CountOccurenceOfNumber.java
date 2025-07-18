package Day02;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfNumber {
    public static void countO(Integer[] nums) {
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int num:nums) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		Integer[] arr= {2,1,4,5,4,6,1,6,7,8,8};
		countO(arr);
		

	}
}
