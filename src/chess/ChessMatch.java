package chess;

import boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8,8); // iniciando uma matriz tabuleiro 8x8
    }

    // Retorna uma matriz de peças correspondente a partida
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColums()];
        for(int i = 0; i < board.getRows(); i++){
            for(int j = 0; j < board.getColums(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j); // Downcasting
            }
        }
        return mat;
    }


}
