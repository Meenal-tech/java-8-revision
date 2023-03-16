package practise_questions.question_4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question_4b {

    public static void main(String[] args) {
        Employee e1 = new Employee("john doe", 8000L, "dehli");
        Employee e2 = new Employee("marry smith", 1000L, "bhopal");
        Employee e3 = new Employee("amy leo", 2000L, "dehli");
        Employee e4 = new Employee("john smith", 10000L, "bhopal");

        List<Employee> list = Arrays.asList(e1, e2, e3, e4);

        list = getEmployeesAfterFilteringWithCriteria(list);

        System.out.println(list.toString());

    }

    private static List<Employee> getEmployeesAfterFilteringWithCriteria(List<Employee> list) {
        Predicate<Employee> cityPredicate = e -> e.getCity().equalsIgnoreCase("dehli");
        Predicate<Employee> salaryPredicate = e -> e.getSalary() > 5000;

        return list.stream()
                .filter(cityPredicate.and(salaryPredicate))
                .distinct()
                .collect(Collectors.toList());
    };

}
