package LabAssignment.SnakeAndLadderGame;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private Board board;
    private List<Player> players;
    private Dice dice;


    public Game(int boardSize, int numPlayers) {
        this.board = new Board(boardSize);
        this.players = new ArrayList<>();
        this.dice = new Dice();

        initializePlayers(numPlayers);
    }

    private void initializePlayers(int numPlayers) {
        if (numPlayers < 2 || numPlayers > 2) {
            throw new IllegalArgumentException("This game is designed for 2 players.");
        }

        players.add(new Player("Player 1"));
        players.add(new Player("Player 2"));
    }

    public boolean isGameOver() {
        for (Player player : players) {
            if (player.getPosition() == board.getSize() - 1) {
                return true;
            }
        }
        return false;
    }


    public void play() {
        while (!isGameOver()) {
            for (Player player : players) {
                int diceRoll = playerRollDice(player);
                System.out.println(player.getName() + " rolled a " + diceRoll);

                int currentPosition = player.getPosition();
                int newPosition = currentPosition + diceRoll;

                if (newPosition >= board.getSize()) {
                    continue; // Player cannot move beyond the board size
                }

                int cellValue = board.getCellValue(newPosition);
                player.setPosition(cellValue);

                System.out.println(player.getName() + " is now at position " + cellValue);

                if (isGameOver()) {
                    System.out.println(player.getName() + " wins!");
                    return;
                }
            }
        }
    }

    private int playerRollDice(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + ", press enter to roll the dice.");
        scanner.nextLine();
        return dice.roll();
    }
}





