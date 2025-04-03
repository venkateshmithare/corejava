public class Electronics {
    String brand;
    String model;
    double price;
    int warrantyYears;
    String category;
    boolean smartDevice;
    double powerConsumption;
    String connectivity;
    String color;
    String manufacturingCountry;

    public Electronics() {
    }

    public Electronics(String brand) {
        this.brand = brand;
    }

    public Electronics(String brand, String model) {
        this(brand);
        this.model = model;
    }

    public Electronics(String brand, String model, double price) {
        this(brand, model);
        this.price = price;
    }

    public Electronics(String brand, String model, double price, int warrantyYears, String category) {
        this(brand, model, price);
        this.warrantyYears = warrantyYears;
        this.category = category;
    }

    public void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
        System.out.println("Warranty Years: " + this.warrantyYears);
        System.out.println("Category: " + this.category);
        System.out.println("Smart Device: " + this.smartDevice);
        System.out.println("Power Consumption: " + this.powerConsumption + " W");
        System.out.println("Connectivity: " + this.connectivity);
        System.out.println("Color: " + this.color);
        System.out.println("Manufacturing Country: " + this.manufacturingCountry);
    }

    public static void main(String[] args) {
        Electronics device1 = new Electronics();
        device1.display();

        Electronics device2 = new Electronics("Samsung");
        device2.display();

        Electronics device3 = new Electronics("Sony", "Bravia X90K");
        device3.display();

        Electronics device4 = new Electronics("LG", "OLED C1", 1500.99);
        device4.display();

        Electronics device5 = new Electronics("Apple", "iPhone 14", 999.99, 1, "Smartphone");
        device5.display();
    }
}

