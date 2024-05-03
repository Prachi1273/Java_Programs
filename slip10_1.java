import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CurrentDateApplication {
    public static void main(String[] args) {
        SpringApplication.run(CurrentDateApplication.class, args);
    }
}

@RestController
public class CurrentDateController {
    @GetMapping("/currentDate")
    public String getCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return formatter.format(date);
    }
}
