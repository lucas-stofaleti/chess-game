package chess;

import board.Board;
import board.Position;
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
	
	private void initialSetup()
	{
		board.placePiece(new Rook(board, Color.BLACK), new Position(0,0));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
	}
}
