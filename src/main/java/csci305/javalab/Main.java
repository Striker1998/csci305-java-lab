package csci305.javalab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by kylewebster1 on 3/28/18.
 */
public class Main {
    //suppresses depreciation warning
    @SuppressWarnings("depreciation")
    //makes a static final map for all of the elements with a HashMap that allows quick access based on the name
    public static final Map<String, Element> moves = new HashMap();

    //supresses depreciation warnings
    @SuppressWarnings("depreciation")
    public static void main(String args[]) {
        // Creates all elements to add to Map
        Rock rock = new Rock("Rock");
        Paper paper = new Paper("Paper");
        Scissors scissors = new Scissors("Scissors");
        Lizard lizard = new Lizard("Lizard");
        Spock spock = new Spock("Spock");

        // puts Elements and names into the map
        moves.put("Rock", rock);
        moves.put("Paper", paper);
        moves.put("Scissors", scissors);
        moves.put("Lizard", lizard);
        moves.put("Spock", spock);

        //creates user input, 2 players
        Scanner reader = new Scanner(System.in);
        Player player1, player2;
        int p1 = 0, p2 = 0;
        //welcome message
        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Kyle Webster.\n");
        System.out.println("Please choose two players:\n" +
                "     (1) Human\n" +
                "     (2) StupidBot\n" +
                "     (3) RandomBot\n" +
                "     (4) IterativeBot\n" +
                "     (5) LastPlayBot\n" +
                "     (6) MyBot\n");
        //accepts user input until user puts in a valid input of integer between 1 and 6
        while (p1 == 0) {
            try {
                System.out.print("Select player 1: ");
                p1 = reader.nextInt();
                System.out.println(p1);
            } catch (Exception e) {
                p1 = 0;
                System.out.println("Invalid input. Try again.");
            }
            if (p1 < 1 || p1 > 6) {
                p1 = 0;
                System.out.println("Invalid input. Try again.");
            }
        }
        //Assigns player1 a new Player class
        switch (p1) {
            case 1:
                player1 = new Human("Human");
                break;
            case 2:
                player1 = new StupidBot("StupidBot");
                break;
            case 3:
                player1 = new RandomBot("RandomBot");
                break;
            case 4:
                player1 = new IterativeBot("IterativeBot");
                break;
            case 5:
                player1 = new LastPlayBot("LastPlayBot");
                break;
            default:
                player1 = new MyBot("Mybot");
        }

        //accepts user input until user puts in a valid input of integer between 1 and 6
        while (p2 == 0) {
            try {
                System.out.print("Select player 2: ");
                p2 = reader.nextInt();
                System.out.println(p2);
            } catch (Exception e) {
                p2 = 0;
                System.out.println("Invalid input. Try again.");
            }
            if (p2 < 1 || p2 > 6) {
                p2 = 0;
                System.out.println("Invalid input. Try again.");
            }
        }
        //Assigns player2 a new Player class
        switch (p2) {
            case 1:
                player2 = new Human("Human");
                break;
            case 2:
                player2 = new StupidBot("StupidBot");
                break;
            case 3:
                player2 = new RandomBot("RandomBot");
                break;
            case 4:
                player2 = new IterativeBot("IterativeBot");
                break;
            case 5:
                player2 = new LastPlayBot("LastPlayBot");
                break;
            default:
                player2 = new MyBot("Mybot");
        }
        //Game Starts
        System.out.println(player1.getName() + " vs " + player2.getName() + ". Go!");
        //sets counter for each player's score
        int p1wins = 0, p2wins = 0;
        //plays 5 games
        for (int i = 0; i < 5; i++) {
            //sets plays for each player and prints results
            Element p1move = player1.play();
            Element p2move = player2.play();
            System.out.println("Player 1 choose: " + p1move.getName());
            System.out.println("Player 2 choose: " + p2move.getName());
            //compares the moves between player1 and player2
            String condition = p1move.compareTo(p2move);
            System.out.println(condition);
            //if player1 wins, add 1 to player counter. If player1 loses, add 1 to player2's counter. Otherwise, nobody gets points and it is a tie
            if (condition.endsWith("Win")) {
                System.out.println("Player 1 won the round\n");
                p1wins++;
            } else if (condition.endsWith("Lose")) {
                System.out.println("Player 2 won the round\n");
                p2wins++;
            } else {
                System.out.println("Round was a tie");
            }
            //sets each player's last move to the move of their opponent (used for MyBot and LastPlayBot
            player1.last = p2move;
            player2.last = p1move;
        }
        //determines score
        System.out.println("The Score is " + p1wins + " to " + p2wins);
        //determines who wins
        if (p1wins > p2wins) {
            System.out.println("Player 1 won");
        } else if (p2wins > p1wins) {
            System.out.println("Player 2 won");
        } else {
            System.out.println("The game was a draw");
        }
    }
}

