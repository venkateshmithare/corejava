package internal;

public class ActionMovie extends Movie{
    @Override
    public void start() {
        System.out.println("Action movie is starting with explosions!");
    }

    public void fightScene() {
        System.out.println("Epic fight scene in action movie");
    }

}
