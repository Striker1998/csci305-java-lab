package csci305.javalab;

import java.util.Random;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public class LastPlayBot extends Player{
    Element last = null;
    public LastPlayBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        if (last != null){
            switch (last.getName()){
                case "rock":
                    last = paper;
                    break;
                case "paper":
                    last = scissors;
                    break;
                case "scissors":
                    last = lizard;
                    break;
                case "lizard":
                    last = spock;
                    break;
                default:
                    last = rock;
            }
        }
        else{
            Random rand = new Random();
            int chooser = rand.nextInt(5);
            switch (chooser){
                case 0:
                    last = rock;
                    break;
                case 1:
                    last = paper;
                    break;
                case 2:
                    last = scissors;
                    break;
                case 3:
                    last = scissors;
                    break;
                default:
                    last = spock;
            }
        }
        return last;
    }
}
