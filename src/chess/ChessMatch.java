package src.chess;

import src.boardgame.Board;
import src.chess.chessPieces.King;
import src.chess.chessPieces.Rook;

public class ChessMatch {
    //classe das regras do xadrez
    private Board board;

    public ChessMatch(){
        this.board = new Board(8, 8); 
        initialSetUp();   
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

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetUp(){
        placeNewPiece('b', 4, new Rook(board, Color.WHITE));
        placeNewPiece('b', 6, new King(board, Color.WHITE));
       
    }
}