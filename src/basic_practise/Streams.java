package basic_practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

//        System.out.println(
//                list.stream()
//                        .mapToInt(e -> e).max()
//        );

        List<String> list1 = Arrays.asList("abc","def");
        System.out.println(
                list1.stream()
                        .collect(Collectors.joining(","))
        );
        System.out.println(list.stream()
                .collect(Collectors.summarizingInt(value -> value * 2))
                .toString());

        System.out.println(
                list.stream()
                        .collect(Collectors.averagingInt(n -> n * 2))
        );

        System.out.println(
                list.stream()
                        .collect(Collectors.toMap(e -> e * 2, e -> e + "Number"))
        );


    }

}
