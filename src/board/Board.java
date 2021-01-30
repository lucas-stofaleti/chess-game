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
		Position position = new Position(row,column);
		if(!positionExists(position))
		{
			throw new BoardException("Posicao Invalida!");
		}
		return pieces[row][column];
	}
	public Piece piece(Position position)
	{
		if(!positionExists(position))
		{
			throw new BoardException("Posicao Invalida!");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position)
	{
		if(thereIsAPiece(position))
		{
			throw new BoardException("Ja existe uma peca!");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position)
	{
		Piece piece = piece(position);
		if(piece!=null)
		{
			piece.position = null;
		}
		pieces[position.getRow()][position.getColumn()] = null;
		return piece;
	}
	
	public boolean positionExists(Position position)
	{
		return position.getRow()<rows && position.getColumn()<columns && position.getRow()>=0 && position.getColumn()>=0;
	}
	public boolean thereIsAPiece(Position position)
	{
		if(!positionExists(position))
		{
			throw new BoardException("Posicao Invalida!");
		}
		return pieces[position.getRow()][position.getColumn()] != null;
	}
}
