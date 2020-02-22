package src.boardgame;

public class Board{
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns){
        if(rows < 1 && columns < 1){
            throw new BoardException("Erro creating board: there must ne at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
    }

    public int getRows(){return this.rows;}
    public int getColumns(){return this.columns;}

    public Piece pieces(int row, int column){
        if(!positionExist(row, column)){
            throw new BoardException("Invalid Position");
        }
        return this.pieces[row][column];
    }
    public Piece pieces(Position position){
        if(!positionExist(position)){
            throw new BoardException("Invalid Position");
        }
        return this.pieces[position.getRow()][position.getColumn()];
    }

    public void placePieca(Piece piece, Position position){
        if(thereIsAPiece(position)){
            throw new BoardException("Already have a piece on position: "+ position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positionExist(int row, int column){
        return row >= 0 && row < getRows() && column >= 0 && column < getColumns();
    }

    public boolean positionExist(Position position){
        return positionExist(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        if(!positionExist(position)){
            throw new BoardException("Invalid Position");
        }
        return pieces(position) != null;
    }
}