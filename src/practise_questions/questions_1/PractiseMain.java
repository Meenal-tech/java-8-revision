package practise_questions.questions_1;

public class PractiseMain {
    public static void main(String[] args) {

        // Boolean is returned if the first number is greater than the second number
        Question_1a question1a = (a, b) -> a > b;

        System.out.println("Is first number greater than the second number - " +
                question1a.firstNumberGreaterOrNot(3, 2));


        // increment the value of the given number
        Question_1b question1b = (n -> n + 1);

        System.out.println("increment the value by one - " +
                question1b.incrementTheValueByOne(2));


        // concatenate two strings
        Question_1c question1c = (s1, s2) -> s1 + " " + s2;
        System.out.println("the concatenated strings are - " +
                question1c.concatenateStrings("meenal", "gupta"));


        // convert the string to lower case
        Question_1d question1d = s -> s.toLowerCase();
        System.out.println("lower case string is - " +
                question1d.convertToLowerCase("MEENAL"));

    }


}
