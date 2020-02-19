package src.chess;

import src.boardgame.Board;

public class ChessMatch {
    //classe das regras do xadrez
    private Board board;

    public ChessMatch(){
        this.board = new Board(8, 8);   
    }

    //retorna a matriz de peças do jogo
    public ChessPiece[][] getPieces(){
        ChessPiece[][] chess = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i< board.getRows(); i++){
            for(int j = 0; j< board.getColumns(); j++){
                chess[i][j] = (ChessPiece) board.pieces(i, j);
            }
        }
        return chess;
    }
}