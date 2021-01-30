package chess;

import board.Position;

public class ChessPosition
{
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) 
	{
		if(row>8 || row<1 || column > 'h' || column<'a')
		{
			throw new ChessException("Posicao Invalida!");
		}
		this.column = column;
		this.row = row;
	}
	
	protected Position toPosition()
	{
		int column = this.column - 'a';
		int row = 8 - this.row;
		Position position = new Position(row,column);
		return position;
	}
	
	protected static ChessPosition fromPosition(Position position)
	{
		char column = (char) (position.getColumn() + 'a');
		int row = 8 - position.getRow();
		return new ChessPosition(column, row);
	}
}
