
public class SolarSystem {
    String starName;
    int numberOfPlanets;
    double age;
    String galaxyName;
    double diameter;
    String dominantElement;
    boolean habitable;
    int knownMoons;
    double gravity;
    String discoveryDate;

    public SolarSystem() {
    }

    public SolarSystem(String starName) {
        this.starName = starName;
    }

    public SolarSystem(String starName, int numberOfPlanets) {
        this(starName);
        this.numberOfPlanets = numberOfPlanets;
    }

    public SolarSystem(String starName, int numberOfPlanets, double age) {
        this(starName, numberOfPlanets);
        this.age = age;
    }

    public SolarSystem(String starName, int numberOfPlanets, double age, String galaxyName, double diameter) {
        this(starName, numberOfPlanets, age);
        this.galaxyName = galaxyName;
        this.diameter = diameter;
    }

    public void display() {
        System.out.println("Star Name: " + this.starName);
        System.out.println("Number of Planets: " + this.numberOfPlanets);
        System.out.println("Age: " + this.age + " billion years");
        System.out.println("Galaxy Name: " + this.galaxyName);
        System.out.println("Diameter: " + this.diameter + " light years");
        System.out.println("Dominant Element: " + this.dominantElement);
        System.out.println("Habitable: " + this.habitable);
        System.out.println("Known Moons: " + this.knownMoons);
        System.out.println("Gravity: " + this.gravity + " m/s²");
        System.out.println("Discovery Date: " + this.discoveryDate);
    }

    public static void main(String[] args) {
        SolarSystem system1 = new SolarSystem();
        system1.display();

        SolarSystem system2 = new SolarSystem("Sun");
        system2.display();

        SolarSystem system3 = new SolarSystem("Alpha Centauri", 3);
        system3.display();

        SolarSystem system4 = new SolarSystem("Proxima Centauri", 1, 4.85);
        system4.display();

        SolarSystem system5 = new SolarSystem("Kepler-90", 8, 2.1, "Milky Way", 0.01);
        system5.display();
    }
}

