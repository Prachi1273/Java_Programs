public class Java4 {
    public static void main(String[] args) {
        String currentLight = "RED";
        int cycleCount = 0;

        while (cycleCount < 6) {
            System.out.println("🚦 " + currentLight + " - " + getAction(currentLight));
            sleep(getDelay(currentLight));

            switch (currentLight) {
                case "RED":
                    currentLight = "GREEN";
                    break;
                case "GREEN":
                    currentLight = "YELLOW";
                    break;
                case "YELLOW":
                    currentLight = "RED";
                    break;
            }
            cycleCount++;
        }
        System.out.println("Traffic signal simulation ended.");
    }

    public static String getAction(String light) {
        switch (light) {
            case "RED":
                return "STOP";
            case "GREEN":
                return "GO";
            case "YELLOW":
                return "SLOW DOWN";
            default:
                return "";
        }
    }

    public static int getDelay(String light) {
        switch (light) {
            case "RED":
            case "GREEN":
                return 5000;
            case "YELLOW":
                return 1000;
            default:
                return 0;
        }
    }

    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.err.println("Sleep interrupted: " + e.getMessage());
        }
    }
}

