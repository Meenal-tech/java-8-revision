package basic_practise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(2, 3, 4, 5, 6);
        List<String> courses = Arrays.asList("AWS", "Springboot", "DevOps", "Java 8", "Springboot");

        filteringTheCourse(courses);

        // mapping the values
        mapTheEvenSquareValues(l);

        // printing the numbers using predicate
        printEvenNumbers(l);

        // collecting the stream elements using collectors
        usingCollectors(l);

        System.out.println(distinctCourses(courses).toString());

    }

    private static void usingCollectors(List<Integer> l) {
        // collecting the list using streams
        List filteredList =
                l.stream()
                        .filter(n -> n % 2 == 0)
                        .collect(Collectors.toList());
    }

    private static void printEvenNumbers(List<Integer> list) {
        // using predicate
        Predicate<Integer> evenNumber = n -> n % 2 == 0;

        list.stream()
                .filter(evenNumber)
                .forEach(System.out::println);
    }

    public static void mapTheEvenSquareValues(List<Integer> list) {

        list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> Math.pow(n, 2))
                .forEach(System.out::println);
    }

    public static List<Integer> filteringTheCourse(List<String> courses) {

        System.out.println("#filteringTheCourse - ");
        return courses.stream()
                .filter(c -> c.equals("AWS"))
                .map(c -> c.length())
                .collect(Collectors.toList());
    }

    public static List<String> distinctCourses(List<String> courses) {
        System.out.println("#distinctCourses - ");
        return courses.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}