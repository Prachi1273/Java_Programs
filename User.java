public class User {
    private int id;
    private String name;
    private String email;
    private String mobile;
    private String deviceMac;

    public User(String name, String email, String mobile, String deviceMac) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.deviceMac = deviceMac;
    }
 }
