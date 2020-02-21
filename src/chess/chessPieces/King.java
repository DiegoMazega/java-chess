package src.chess.chessPieces;

import src.boardgame.Board;
import src.chess.ChessPiece;
import src.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }

}