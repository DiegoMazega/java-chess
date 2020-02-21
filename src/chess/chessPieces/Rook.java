package src.chess.chessPieces;

import src.boardgame.Board;
import src.chess.ChessPiece;
import src.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }

}