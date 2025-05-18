import java.sql.Timestamp;

public class AccessLog {
    private int id;
    private int userId;
    private Timestamp loginTime;
    private Timestamp logoutTime;
    private String zone;
    private double dataUsed;

    public AccessLog(int userId, Timestamp loginTime, String zone) {
        this.userId = userId;
        this.loginTime = loginTime;
        this.zone = zone;
    }

    // Getters and setters omitted for brevity
}
