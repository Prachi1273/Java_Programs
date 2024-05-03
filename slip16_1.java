import java.util.TreeSet;

public class CreateTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet of strings
        TreeSet<String> colors = new TreeSet<>();

        // Add some colors to the TreeSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        // Print the TreeSet in ascending order
        System.out.println("TreeSet in ascending order:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

