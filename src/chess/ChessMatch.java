package chess;

import board.Board;

public class ChessMatch
{
	private Board board;
	
	public ChessMatch()
	{
		board = new Board(8,8);
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
}
