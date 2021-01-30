package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece
{
	public Rook(Board board, Color color) 
	{
		super(board, color);
	}

	@Override
	public String toString() 
	{
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() 
	{
		boolean mat[][] = new boolean[8][8];
		Position p = new Position(0,0);
		
		//Acima
		p.setValues(position.getRow()-1, position.getColumn());
		while(this.getBoard().positionExists(p) && !this.getBoard().thereIsAPiece(p))
		{
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow()-1, p.getColumn());
		}
		if(this.getBoard().positionExists(p) && ((ChessPiece) (this.getBoard().piece(p))).getColor() != ((ChessPiece) (this.getBoard().piece(position))).getColor())
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//Abaixo
		p.setValues(position.getRow()+1, position.getColumn());
		while(this.getBoard().positionExists(p) && !this.getBoard().thereIsAPiece(p))
		{
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow()+1, p.getColumn());
		}
		if(this.getBoard().positionExists(p) && ((ChessPiece) (this.getBoard().piece(p))).getColor() != ((ChessPiece) (this.getBoard().piece(position))).getColor())
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//Esquerda
		p.setValues(position.getRow(), position.getColumn()+1);
		while(this.getBoard().positionExists(p) && !this.getBoard().thereIsAPiece(p))
		{
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow(), p.getColumn()+1);
		}
			if(this.getBoard().positionExists(p) && ((ChessPiece) (this.getBoard().piece(p))).getColor() != ((ChessPiece) (this.getBoard().piece(position))).getColor())
		{
			mat[p.getRow()][p.getColumn()] = true;
		}		
		
		//Abaixo
		p.setValues(position.getRow(), position.getColumn()-1);
		while(this.getBoard().positionExists(p) && !this.getBoard().thereIsAPiece(p))
		{
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow(), p.getColumn()-1);
		}
		if(this.getBoard().positionExists(p) && ((ChessPiece) (this.getBoard().piece(p))).getColor() != ((ChessPiece) (this.getBoard().piece(position))).getColor())
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		return mat;
	}
}
