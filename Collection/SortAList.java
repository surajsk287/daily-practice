package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortAList {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,8,1,3,3,2,1);
        Collections.sort(list);
        System.out.println(list);
        Set<Integer> set=new HashSet<>(list);
        System.out.println(set);
    }
}
