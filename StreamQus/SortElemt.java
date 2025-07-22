package StreamQus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortElemt {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(55,73,22,19,25,33);
        List<Integer> sortNum=nums.stream()
                              .sorted()
                              .collect(Collectors.toList());
        System.out.println(sortNum);

        List<String> str=Arrays.asList("Suraj","Abhi","Raj");
        List<String> sortStr=str.stream()
                              .sorted()
                              .collect(Collectors.toList());
        System.out.println(sortStr);
    }
}
