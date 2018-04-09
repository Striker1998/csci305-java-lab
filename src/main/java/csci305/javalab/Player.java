package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public abstract class Player {
    //stores the last element played by the opponent, used for MyBot and LastPlayBot
    public Element last = null;
    //stores the name
    private String name;

    public Player(String name) {
        this.name = name;
    }

    //gets the name of the player class
    public String getName() {
        return name;
    }

    //abstractly creates Element Class
    public abstract Element play();
}
