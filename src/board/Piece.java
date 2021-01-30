package board;

public abstract class Piece 
{
	protected Position position;
	private Board board;
	
	public Piece(Board board)
	{
		this.position = null;
		this.board = board;
	}

	public Board getBoard() 
	{
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position)
	{
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove()
	{
		boolean[][] moves = possibleMoves();
		for(int i=0; i<moves.length; i++)
		{
			for(int j=0; j<moves[i].length; j++)
			{
				if(moves[i][j])
				{
					return true;
				}
			}
		}
		return false;
	}
}
