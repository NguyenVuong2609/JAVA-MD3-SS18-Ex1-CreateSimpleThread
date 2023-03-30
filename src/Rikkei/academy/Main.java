package Rikkei.academy;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator("Thread 1", Thread.MAX_PRIORITY);
        NumberGenerator numberGenerator1 = new NumberGenerator("Thread 2", Thread.MIN_PRIORITY);
    }
}
