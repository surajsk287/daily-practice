package StreamQus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertAllStringsInListtoUppercase {
    public static void main(String[] args) {
        List<String> str=Arrays.asList("suraj","raj","abhi");
        List<String> str1=str.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(str1);
    }
}
