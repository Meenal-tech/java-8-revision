package practise_questions.question_5;

public class MainClass implements Interface_1, Interface_2{

    @Override
    public void printString() {
        System.out.println("Main Class");
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.printString();
    }
}
