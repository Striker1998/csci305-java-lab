package csci305.javalab;

import java.util.Random;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public class LastPlayBot extends Player {
    public LastPlayBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        Element play;
        Random rand = new Random();
        int chooser = rand.nextInt(5);
        switch (chooser) {
            case 0:
                play = rock;
                break;
            case 1:
                play = paper;
                break;
            case 2:
                play = scissors;
                break;
            case 3:
                play = scissors;
                break;
            default:
                play = spock;
        }
        return play;
    }

    public Element play(Element lastPlayerMove) {
        Element play;
        switch (lastPlayerMove.getName()) {
            case "rock":
                play = paper;
                break;
            case "paper":
                play = scissors;
                break;
            case "scissors":
                play = lizard;
                break;
            case "lizard":
                play = spock;
                break;
            default:
                play = rock;
        }
        return play;
    }
}
