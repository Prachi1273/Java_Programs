import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Continent
{
	String con;
	InputStreamReader i = new InputStreamReader(System.in);
	BufferedReader r = new BufferedReader(i);
	
	void con_input() throws IOException
	{
		System.out.println("Enter Continent Name: ");
		con = r.readLine();
	}
}

class Country extends Continent
{
	String cou ;
	void cou_input() throws IOException
	{
		System.out.println("Enter Country Name: ");
		cou = r.readLine();
	}
}

class State extends Country
{
	String sta;
	void sta_input() throws IOException
	{
		System.out.println("Enter State Name: ");
		sta = r.readLine();
	}
}

class Main extends State
{
	String pla;
	
	void pla_input()throws IOException
	{
		System.out.println("Enter Place Name : ");
		pla = r.readLine();

	}

	public static void main( String argsp[] )throws IOException
	{
		Main s = new Main();
		s.con_input();
		s.cou_input();
		s.sta_input();
		s.pla_input();
		System.out.println("\n\nContinent: "+s.con);
		System.out.println("Country: "+s.cou);
		System.out.println("State: "+s.sta);
		System.out.println("Place :" + s.pla);
	}
}

/*
public class Main {

    public static void main(String[] args) {
        // Create a new instance of the State class
        State state = new State("California", "United States");

        // Display the place, State, Country, and Continent
        System.out.println("Place: " + state.getPlace());
        System.out.println("State: " + state.getState());
        System.out.println("Country: " + state.getCountry());
        System.out.println("Continent: " + state.getContinent());
    }
}

class Continent {

    private String continent;

    public Continent(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }
}

class Country extends Continent {

    private String country;

    public Country(String country, String continent) {
        super(continent);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}

class State extends Country {

    private String state;

    public State(String state, String country) {
        super(country);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public String getPlace() {
        return "San Francisco";
    }
}
*/
