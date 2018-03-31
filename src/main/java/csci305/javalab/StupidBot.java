package csci305.javalab;
import java.util.Random;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public class StupidBot extends Player {
    private Element name;
    private int chooser;

    public StupidBot(String name) {
        super(name);
        Random chooser = new Random();
        this.chooser = chooser.nextInt(5);
    }

    @Override
    public Element play() {
        switch (chooser){
            case 0:
                name = rock;
                break;
            case 1:
                name = paper;
                break;
            case 2:
                name = scissors;
                break;
            case 3:
                name = scissors;
                break;
            default:
                name = spock;
        }
        return name;
    }
}
