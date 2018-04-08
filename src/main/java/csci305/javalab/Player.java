package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public abstract class Player {
    private String name;
    static final Element rock = new Rock("Rock");
    static final Element paper = new Paper("Paper");
    static final Element scissors = new Scissors("Scissors");
    static final Element lizard = new Lizard("Lizard");
    static final Element spock = new Spock("Spock");


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Element play();
}
