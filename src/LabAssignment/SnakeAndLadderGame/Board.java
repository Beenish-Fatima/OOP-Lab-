package LabAssignment.SnakeAndLadderGame;

public class Board {

    private final int size;
    private int[] cells;

    public Board(int size) {
        this.size = size;
        this.cells = new int[size];
        initializeBoard();
    }

    private void initializeBoard(){
        for (int i = 0; i < size; i++) {
            cells[i] = i + 1;
        }
    }

    public int getSize(){
        return size;
    }

    public int getCellValue(int position){
        return cells[position];
    }

    public void setCellValue(int position, int value){
        cells[position] = value;
    }
}