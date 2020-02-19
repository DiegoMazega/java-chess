package src.boardgame;

public class Board{
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
    }

    public int getRows(){return this.rows;}
    public int getColumns(){return this.columns;}

    public void setRows(int rows){this.rows = rows;}
    public void setColumns(int columns){this.columns = columns;}

    public Piece pieces(int row, int column){return this.pieces[row][column];}
    public Piece pieces(Position position){return this.pieces[position.getRow()][position.getColumn()];}

}