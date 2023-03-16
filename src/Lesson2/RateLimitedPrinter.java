package Lesson2;

public class RateLimitedPrinter {
    private int interval;

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
    }

    public void print(String message) throws InterruptedException {
        for (int i = 0; i < 1_000_000_000; i++) {
            long startTime = System.currentTimeMillis();
            System.out.println(message);
            long endTime = System.currentTimeMillis();
            if ((endTime - startTime) <= interval) {
                Thread.sleep((interval - (endTime - startTime)));
            }
        }
    }
}
