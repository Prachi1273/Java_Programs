public class slip8_1 extends Thread {
    String str;
    int n;

    slip8_1(String str, int n) {
        this.str = str;
        this.n = n;
    }
    
    public void run() {
        try {
            for (int i = 0; i < n; i++) {
                System.out.println(getName() + " : " + str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        slip8_1 t1 = new slip8_1("COVID19", 10);
        slip8_1 t2 = new slip8_1("LOCKDOWN2020", 20);
        slip8_1 t3 = new slip8_1("VACCINATED", 30);

        t1.start();
        t2.start();
        t3.start();

    }
}
