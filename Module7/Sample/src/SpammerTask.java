public class SpammerTask implements Runnable{
    private String text;
    private int runNumber = 0;
    private int MAX_VALUE = 40;

    public SpammerTask(String text, int runNumber) {
        this.text = text;
        this.runNumber = runNumber;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = (-1 * MAX_VALUE); i < MAX_VALUE; i++) {
            for (int j = (-1 * MAX_VALUE); j < MAX_VALUE; j++) {
                System.out.println(this.runNumber + "" + text + " " + i + " " + j);
            }
        }
        System.out.println("End Spamming");
        long end = System.currentTimeMillis();
        System.out.println(String.format("I spammed %s for %f seconds", text, ((end - start)/1000.0)));
    }
}
