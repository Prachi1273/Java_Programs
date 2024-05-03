import java.util.concurrent.TimeUnit;

public class TrafficSignal {

    private static final int RED_DURATION = 3000;
    private static final int YELLOW_DURATION = 1000;
    private static final int GREEN_DURATION = 3000;

    private enum Color {
        RED, YELLOW, GREEN
    }

    private Color currentColor;

    public TrafficSignal() {
        currentColor = Color.RED;
    }

    public void changeColor() {
        switch (currentColor) {
            case RED:
                currentColor = Color.GREEN;
                break;
            case GREEN:
                currentColor = Color.YELLOW;
                break;
            case YELLOW:
                currentColor = Color.RED;
                break;
        }
    }

    public void run() {
        while (true) {
            changeColor();
            System.out.println("Current color: " + currentColor);
            try {
                TimeUnit.MILLISECONDS.sleep(getDuration());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int getDuration() {
        switch (currentColor) {
            case RED:
                return RED_DURATION;
            case YELLOW:
                return YELLOW_DURATION;
            case GREEN:
                return GREEN_DURATION;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        TrafficSignal trafficSignal = new TrafficSignal();
        Thread thread = new Thread(trafficSignal);
        thread.start();
    }
}
