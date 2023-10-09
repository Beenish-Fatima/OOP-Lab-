package LabAssignment.SnakeAndLadderGame;

public class LudoGame {


    public static void main(String[] args) {
        int boardSize = 100;
        int numPlayers = 2;

        Game game = new Game(boardSize, numPlayers);
        game.play();

    }

}
