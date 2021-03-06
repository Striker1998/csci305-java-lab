package csci305.javalab;

/**
 * Created by kylewebster1 on 3/19/18.
 */
//Abstract Element of Rock Paper Scissors Lizard Spock moves
public abstract class Element {
    private String name;

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String compareTo(Element e);
}

