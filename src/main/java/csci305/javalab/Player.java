package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public abstract class Player {
    private String name;
    static final Element rock = new Rock("Rock");
    static final Element paper = new Rock("Paper");
    static final Element scissors = new Rock("Scissors");
    static final Element lizard = new Rock("Lizard");
    static final Element spock = new Rock("Spock");


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Element play();
}
