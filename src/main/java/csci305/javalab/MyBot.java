package csci305.javalab;

import java.util.Random;

/**
 * Created by kylewebster1 on 3/26/18.
 */
public class MyBot extends Player {
    Element play;
    public MyBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        Random rand = new Random();
        int chooser = rand.nextInt(5);
        switch (chooser){
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

    public Element play(Element inPlayersLastMove, String condition, Boolean isFirst){
        Random rand = new Random();
        int chooser = rand.nextInt(2);
        if(winCondition(condition, isFirst)){
            play = inPlayersLastMove;
        }
        else{
            switch(inPlayersLastMove.getName()){
                case "rock":
                    if(chooser ==1 ){ play = paper;}
                    else{ play = spock;}
                    break;
                case "scissors":
                    if(chooser ==1 ){ play = rock;}
                    else{ play = spock;}
                    break;
                case "paper":
                    if(chooser ==1 ){ play = scissors;}
                    else{ play = lizard;}
                    break;
                case "lizard":
                    if(chooser ==1 ){ play = scissors;}
                    else{ play = rock;}
                    break;
                default:
                    if(chooser == 1){ play = lizard;}
                    else{play = paper;}
            }
        }

        return play;
    }

    private Boolean winCondition(String condition, Boolean isFirst){
        Boolean check = false;
        if(isFirst){
            String[] win = condition.split("Win");
            if (win.length== 1){
                check = true;
            }
        }
        else{
            String[] win = condition.split("Lose");
            if (win.length == 1){
                check = true;
            }
        }
        return check;
    }
}
