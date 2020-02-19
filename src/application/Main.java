package src.application;

import src.chess.ChessMatch;
//print do tabuleiro
class Main{
    public static void main(String[] args) {
      ChessMatch  chessMatch = new ChessMatch();
      UI.printBoard(chessMatch.getPieces());
    }
}