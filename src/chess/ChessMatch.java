package chess;

import board.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch
{
	private Board board;
	
	public ChessMatch()
	{
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces()
	{
		ChessPiece[][] pieces = new ChessPiece[8][8];
		
		for(int i=0; i<8; i++)
		{
			for(int j=0; j<8; j++)
			{
				pieces[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return pieces;
	}
	
	private void insertPiece(ChessPiece piece, ChessPosition cposition)
	{
		board.placePiece(piece, cposition.toPosition());
	}
	
	private void initialSetup()
	{
		insertPiece(new Rook(board, Color.BLACK), new ChessPosition('a',8));
		insertPiece(new King(board, Color.BLACK), new ChessPosition('d',8));
	}
}
