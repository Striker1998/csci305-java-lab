package csci305.javalab;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public class Lizard extends Element {
    public Lizard(String name){
        super(name);
    }
    @Override
    public String compareTo(Element e) {
        String situation;
        String output;
        Outcome o = new Outcome();
        if (e.getName().equals("Paper")) {
            situation = "Lizard eats Paper";
            output = "Win";
        } else if (e.getName().equals("Scissors")) {
            situation = "Scissors decapitates Lizard";
            output = "Lose";
        } else if (e.getName().equals("Rock")) {
            situation = "Rock crushes Lizard";
            output = "Lose";
        } else if (e.getName().equals("Spock")) {
            situation = "Lizard poisons Spock";
            output = "Win";
        } else{
            situation = "Lizard equals Lizard";
            output = "Tie";
        }
        return o.compare(situation, output);
    }
}