package basic_practise;

import java.util.*;

public class Lambdas {
    public static void main(String[] args) {

//        basic_practise.MyInterface add = (a, b) -> a + b;
//        System.out.println(add.display(2, 3));

        Employee e1 = new Employee("meenal", 10);
        Employee e2 = new Employee("john", 20);

        List<Employee> list = Arrays.asList(e1, e2);

        Collections.sort(list, Comparator.comparingInt(Employee::getAge));
        System.out.println("#sorted list in ascending order - " + list);

        Collections.sort(list, (Employee emp1, Employee emp2) -> emp2.getAge() - emp1.getAge());
        System.out.println("#sorted list in reverse order of age - " + list);

        Instance instance = new Instance();

        MyInterface myInterface = Dummy::staticMethod;

        MyInterface myInterface1 = instance::instanceMethod;

        myInterface.test();
        myInterface1.test();

    }
}

