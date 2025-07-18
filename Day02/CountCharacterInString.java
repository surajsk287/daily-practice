package Day02;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterInString {
    public static void main(String[] args) {
		String str="countcharacterinstringss";		 
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			String ch=String.valueOf(str.charAt(i));//make every character as string and store in ch variable
			//System.out.print(ch+" ");
			if(map.containsKey(ch)) {//check character that are already store are not 
				map.put(ch, map.get(ch)+1);//if character are present then add one to the value  
			}else {
				map.put(ch, 1);// agar nhi h to map me daal do aur count 1 set kar do
			}
		}
		System.out.println(map);
	}
}
