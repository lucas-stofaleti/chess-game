package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		while(true)
		{
			try
			{
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.print("\nSource: ");
				ChessPosition source = UI.readChessPosition(sc);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), chessMatch.possibleMovesColor(source));
				System.out.print("\nTarget: ");
				ChessPosition target = UI.readChessPosition(sc);
				System.out.println();
				ChessPiece piece = chessMatch.perfomChessMove(source, target);
			}
			catch(RuntimeException e)
			{
				System.out.print(e.getMessage());
				sc.nextLine();
				sc.nextLine();
			}
		}
	}
}
