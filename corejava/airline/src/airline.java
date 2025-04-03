public class airline {

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

    public airline() {
    }

    public airline(String name) {
        this.name = name;
    }

    public airline(String name, String country) {
        this(name);
        this.country = country;
    }

    public airline(String name, String country, int fleetSize) {
        this(name, country);
        this.fleetSize = fleetSize;
    }

    public airline(String name, String country, int fleetSize, int foundedYear, double revenue) {
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
        airline airline1 = new airline();
        airline1.display();

        airline airline2 = new airline("Emirates");
        airline2.display();

        airline airline3 = new airline("Qatar Airways", "Qatar");
        airline3.display();

        airline airline4 = new airline("Singapore Airlines", "Singapore", 150);
        airline4.display();

        airline airline5 = new airline("British Airways", "UK", 250, 1974, 12.5);
        airline5.display();
    }
}
