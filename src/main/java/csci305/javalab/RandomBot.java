package csci305.javalab;
import java.util.Random;
/**
 * Created by kylewebster1 on 3/26/18.
 */
public class RandomBot extends Player {
    private Element name;
    public RandomBot(String name) {
        super(name);
    }
    @Override
    public Element play() {
        Random rand = new Random();
        int chooser = rand.nextInt(5);
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
