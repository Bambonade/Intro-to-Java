import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] text = {"First","Second","Third","Fourth"};
        for (int i = 0; i < 5; i++) {
            Runnable task = new SpammerTask(text[i],i+1);
            Thread thread = new Thread(task);
            thread.setPriority(i+1);
            thread.start();
        }
    }
}