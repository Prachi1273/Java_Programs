import java.util.*;

public class CitySTDCodes {

    private static HashMap<String, String> citySTDCodes = new HashMap<>();

    public static void main(String[] args) {
        // Add some city names and their STD codes to the HashMap
        citySTDCodes.put("Bangalore", "080");
        citySTDCodes.put("Chennai", "044");
        citySTDCodes.put("Delhi", "011");
        citySTDCodes.put("Hyderabad", "040");
        citySTDCodes.put("Kolkata", "033");
        citySTDCodes.put("Mumbai", "022");

        // Add a new city and its code
        citySTDCodes.put("Pune", "020");

        // Remove a city from the collection
        citySTDCodes.remove("Delhi");

        // Search for a city name and display the code
        String cityName = "Bangalore";
        String stdCode = citySTDCodes.get(cityName);
        if (stdCode != null) {
            System.out.println("The STD code for " + cityName + " is " + stdCode);
        } else {
            System.out.println("City not found");
        }
    }
}
