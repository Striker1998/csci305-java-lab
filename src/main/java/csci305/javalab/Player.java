package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public abstract class Player {
    private String name;

    public Element last = null;
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Element play();
}
