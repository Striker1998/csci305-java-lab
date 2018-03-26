package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */

public class Paper extends Element {
    public Paper(String name){
        super(name);
    }
    @Override
    public String compareTo(Element e) {
        String situation;
        String output;
        Outcome o = new Outcome();
        if (e.getName().equals("Rock")) {
            situation = "Paper covers Rock";
            output = "Win";
        } else if (e.getName().equals("Scissors")) {
            situation = "Scissors cuts Paper";
            output = "Lose";
        } else if (e.getName().equals("Spock")) {
            situation = "Paper disproves Spock";
            output = "Win";
        } else if (e.getName().equals("Lizard")) {
            situation = "Lizard eats Paper";
            output = "Lose";
        } else{
            situation = "Paper equals Paper";
            output = "Tie";
        }
        return o.compare(situation, output);
    }
}
