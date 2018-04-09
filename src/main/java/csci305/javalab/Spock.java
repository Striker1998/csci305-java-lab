package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
//Spock Element, beats scissors and rock, loses to paper and lizard
public class Spock extends Element {
    public Spock(String name) {
        super(name);
    }

    @Override
    public String compareTo(Element e) {
        String situation;
        String output;
        Outcome o = new Outcome();
        //compares element to other player 'e'
        if (e.getName().equals("Paper")) {
            situation = "Paper disproves Spock";
            output = "Lose";
        } else if (e.getName().equals("Scissors")) {
            situation = "Spock smashes Scissors";
            output = "Win";
        } else if (e.getName().equals("Rock")) {
            situation = "Spock vaporizes Rock";
            output = "Win";
        } else if (e.getName().equals("Lizard")) {
            situation = "Lizard poisons Spock";
            output = "Lose";
        } else {
            situation = "Spock equals Spock";
            output = "Tie";
        }
        //merges the situation and output
        return o.compare(situation, output);
    }
}