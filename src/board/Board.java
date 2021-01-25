package board;

public class Board 
{
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns)
	{
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[this.rows][this.columns];
	}
}
