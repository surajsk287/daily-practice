package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Suraj","Kajal","Priya","Abhi","Suraj");

        Set<String> set=new HashSet<>(list);

        System.out.println(set);
    }
}
