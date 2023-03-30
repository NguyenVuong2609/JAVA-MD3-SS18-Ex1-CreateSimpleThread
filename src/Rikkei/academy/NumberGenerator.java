package Rikkei.academy;

public class NumberGenerator implements Runnable{
    private Thread myThread;
    private final String threadName;
    public NumberGenerator(String name, int priority){
        myThread = new Thread(this,name);
        threadName = name;
        myThread.setPriority(priority);
        System.out.println("My thread is created!" + myThread);
        myThread.start();
    }

    public Thread getMyThread(){
        return myThread;
    }


    @Override
    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println(threadName + " printing the count " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
