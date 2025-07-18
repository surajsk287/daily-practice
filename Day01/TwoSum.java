import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSumArray(int[] num, int target) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0; i<num.length; i++) {
			int diff=target-num[i];
			if(map.containsKey(diff)) {
				return new int[] {map.get(diff),i};
			}
			map.put(num[i], i);
		}
		return null;
	}

	public static void main(String[] args) {

		int[] num= {2,7,11,15};
		int target=22;
		int[] result=twoSumArray(num, target);
		if(result!=null) {
			System.out.println("Indices : "+result[0]+", "+result[1]);
		}else {
			System.out.println("No pair found");
		}
		
	}

}
