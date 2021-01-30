package chess;

import application.UI;
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
	
	private void insertPiece(ChessPiece piece, ChessPosition cposition)
	{
		board.placePiece(piece, cposition.toPosition());
	}
	
	private void initialSetup()
	{
		insertPiece(new Rook(board, Color.BLACK), new ChessPosition('a',7));
		insertPiece(new Rook(board, Color.WHITE), new ChessPosition('a',1));
		insertPiece(new King(board, Color.BLACK), new ChessPosition('a',8));
		insertPiece(new King(board, Color.BLACK), new ChessPosition('b',7));
		insertPiece(new King(board, Color.BLACK), new ChessPosition('a',6));
	}
	
	public ChessPiece perfomChessMove(ChessPosition source, ChessPosition target)
	{
		if(!board.thereIsAPiece(source.toPosition()))
		{
			throw new ChessException("Nao ha peca para mover!");
		}
		if(!board.piece(source.toPosition()).isThereAnyPossibleMove())
		{
			throw new ChessException("Peca presa!");
		}
		if(!board.piece(source.toPosition()).possibleMove(target.toPosition()))
		{
			throw new ChessException("Nao eh possivel mover para a casa escolhida!");
		}
		
		ChessPiece pieceSource = (ChessPiece) board.removePiece(source.toPosition());
		ChessPiece pieceTarget = (ChessPiece) board.removePiece(target.toPosition());
		board.placePiece(pieceSource, target.toPosition());
		return pieceTarget;
	}
	
	public boolean[][] possibleMovesColor(ChessPosition source)
	{
		if(!board.thereIsAPiece(source.toPosition()))
		{
			UI.printBoard(getPieces());
			throw new ChessException("\nNao ha peca para mover!");
		}
		boolean[][] colorBoard = new boolean[8][8];
		Position position = source.toPosition();
		boolean[][] mat = board.piece(position).possibleMoves();
		
		for(int i=0; i<8; i++)
		{
			for(int j=0; j<8; j++)
			{
				colorBoard[i][j] = mat[i][j];
			}
		}
		
		return colorBoard;
	}
}
