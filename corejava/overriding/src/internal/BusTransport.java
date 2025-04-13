package internal;

public class BusTransport extends Transport{
    @Override
    public void startRide() {
        System.out.println("Bus is starting the city tour");
    }

    public void collectTickets() {
        System.out.println("Collecting tickets from passengers");
    }
}
