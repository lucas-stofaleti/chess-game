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
	
	public Piece piece(int row, int column)
	{
		return pieces[row][column];
	}
	public Piece piece(Position position)
	{
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position)
	{
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
}
