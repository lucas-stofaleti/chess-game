package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece
{
	public King(Board board, Color color) 
	{
		super(board, color);
	}

	@Override
	public String toString() 
	{
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() 
	{
		boolean mat[][] = new boolean[8][8];
		Position p = new Position(0,0);
		
		//Acima
		p.setValues(position.getRow()-1, position.getColumn());
		if(this.getBoard().positionExists(p) && !this.getBoard().thereIsAPiece(p))
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		else if(this.getBoard().positionExists(p) && ((ChessPiece) (this.getBoard().piece(p))).getColor() != ((ChessPiece) (this.getBoard().piece(position))).getColor())
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//Abaixo
		p.setValues(position.getRow()+1, position.getColumn());
		if(this.getBoard().positionExists(p) && !this.getBoard().thereIsAPiece(p))
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		else if(this.getBoard().positionExists(p) && ((ChessPiece) (this.getBoard().piece(p))).getColor() != ((ChessPiece) (this.getBoard().piece(position))).getColor())
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//Esquerda
		p.setValues(position.getRow(), position.getColumn()+1);
		if(this.getBoard().positionExists(p) && !this.getBoard().thereIsAPiece(p))
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		else if(this.getBoard().positionExists(p) && ((ChessPiece) (this.getBoard().piece(p))).getColor() != ((ChessPiece) (this.getBoard().piece(position))).getColor())
		{
			mat[p.getRow()][p.getColumn()] = true;
		}		
		
		//Abaixo
		p.setValues(position.getRow(), position.getColumn()-1);
		if(this.getBoard().positionExists(p) && !this.getBoard().thereIsAPiece(p))
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		else if(this.getBoard().positionExists(p) && ((ChessPiece) (this.getBoard().piece(p))).getColor() != ((ChessPiece) (this.getBoard().piece(position))).getColor())
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//Nordeste
		p.setValues(position.getRow()-1, position.getColumn()+1);
		if(this.getBoard().positionExists(p) && !this.getBoard().thereIsAPiece(p))
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		else if(this.getBoard().positionExists(p) && ((ChessPiece) (this.getBoard().piece(p))).getColor() != ((ChessPiece) (this.getBoard().piece(position))).getColor())
		{
			mat[p.getRow()][p.getColumn()] = true;
		}		
		
		//Noroeste
		p.setValues(position.getRow()-1, position.getColumn()-1);
		if(this.getBoard().positionExists(p) && !this.getBoard().thereIsAPiece(p))
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		else if(this.getBoard().positionExists(p) && ((ChessPiece) (this.getBoard().piece(p))).getColor() != ((ChessPiece) (this.getBoard().piece(position))).getColor())
		{
			mat[p.getRow()][p.getColumn()] = true;
		}	
		
		//Sudeste
		p.setValues(position.getRow()+1, position.getColumn()+1);
		if(this.getBoard().positionExists(p) && !this.getBoard().thereIsAPiece(p))
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		else if(this.getBoard().positionExists(p) && ((ChessPiece) (this.getBoard().piece(p))).getColor() != ((ChessPiece) (this.getBoard().piece(position))).getColor())
		{
			mat[p.getRow()][p.getColumn()] = true;
		}			

		//Sudoeste
		p.setValues(position.getRow()+1, position.getColumn()-1);
		if(this.getBoard().positionExists(p) && !this.getBoard().thereIsAPiece(p))
		{
			mat[p.getRow()][p.getColumn()] = true;
		}
		else if(this.getBoard().positionExists(p) && ((ChessPiece) (this.getBoard().piece(p))).getColor() != ((ChessPiece) (this.getBoard().piece(position))).getColor())
		{
			mat[p.getRow()][p.getColumn()] = true;
		}			
		
		return mat;
	}
}
