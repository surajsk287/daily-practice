package StreamQus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(10,20,30,10,28,22,20,22);
        List<Integer> uniqueNum=num.stream()
                                .distinct()
                                .collect(Collectors.toList());
        System.out.println(uniqueNum);
    }
}
