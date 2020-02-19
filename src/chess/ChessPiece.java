package src.chess;

import src.boardgame.Board;
import src.boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }

    public Color getColor(){return this.color;}
}