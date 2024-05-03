public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours, int minutes, int seconds) {
        if (validateTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            throw new IllegalArgumentException("Invalid time provided");
        }
    }

    private boolean validateTime(int hours, int minutes, int seconds) {
        return (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59) && (seconds >= 0 && seconds <= 59);
    }

    public String setAmPm() {
        if (this.hours < 12) {
            return String.format("%02d:%02d:%02d AM", this.hours, this.minutes, this.seconds);
        } else {
            return String.format("%02d:%02d:%02d PM", this.hours - 12, this.minutes, this.seconds);
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock(13, 30, 45);
        System.out.println(clock.setAmPm());  // Output: 01:30:45 PM
    }
}

