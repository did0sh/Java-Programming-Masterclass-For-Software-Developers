package section15_Threads.customcode;

public class CountdownThread extends Thread {
    private Countdown countdown;

    public CountdownThread(Countdown countdown) {
        this.countdown = countdown;
    }

    @Override
    public void run() {
        countdown.doCountdown();
    }
}
