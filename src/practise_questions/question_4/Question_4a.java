package practise_questions.question_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_4a {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        List evenNumberList = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(evenNumberList.toString());

    }

}
