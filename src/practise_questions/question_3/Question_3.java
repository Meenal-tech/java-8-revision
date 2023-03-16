package practise_questions.question_3;

public class Question_3 {

    public static void main(String[] args) {

        Thread thread = new Thread(
                () -> {
                    System.out.println("in the runnable method body");
                }
        );
        thread.start();
        System.out.println("in main thread");
    }

}
