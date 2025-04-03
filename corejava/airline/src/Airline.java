public class Airline {

    String name;
    String country;
    int fleetSize;
    int foundedYear;
    double revenue;
    String hub;
    String alliance;
    int destinations;
    int employees;
    String ceo;

    public Airline() {
    }

    public Airline(String name) {
        this.name = name;
    }

    public Airline(String name, String country) {
        this(name);
        this.country = country;
    }

    public Airline(String name, String country, int fleetSize) {
        this(name, country);
        this.fleetSize = fleetSize;
    }

    public Airline(String name, String country, int fleetSize, int foundedYear, double revenue) {
        this(name, country, fleetSize);
        this.foundedYear = foundedYear;
        this.revenue = revenue;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Country: " + this.country);
        System.out.println("Fleet Size: " + this.fleetSize);
        System.out.println("Founded Year: " + this.foundedYear);
        System.out.println("Revenue: " + this.revenue + " billion USD");
        System.out.println("Hub: " + this.hub);
        System.out.println("Alliance: " + this.alliance);
        System.out.println("Destinations: " + this.destinations);
        System.out.println("Employees: " + this.employees);
        System.out.println("CEO: " + this.ceo);
    }

    public static void main(String[] args) {
        Airline airline1 = new Airline();
        airline1.display();

        Airline airline2 = new Airline("Emirates");
        airline2.display();

        Airline airline3 = new Airline("Qatar Airways", "Qatar");
        airline3.display();

        Airline airline4 = new Airline("Singapore Airlines", "Singapore", 150);
        airline4.display();

        Airline airline5 = new Airline("British Airways", "UK", 250, 1974, 12.5);
        airline5.display();
    }
}
