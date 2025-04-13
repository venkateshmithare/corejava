package internal;

public class BasketballArena extends SportsArena{
    @Override
    public void hostEvent() {
        System.out.println("BasketballArena is hosting a basketball match");
    }
    public void displayScoreboard() {
        System.out.println("Displaying live scoreboard");
    }
}
