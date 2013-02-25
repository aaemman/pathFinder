package Main;

import java.util.ArrayList;

public class Set {

	public static void main(String[] args) {

		ArrayList<ArrayList<Cell>> board = new ArrayList<ArrayList<Cell>>();

		ArrayList<Cell> row1 = new ArrayList<Cell>();
		ArrayList<Cell> row2 = new ArrayList<Cell>();
		ArrayList<Cell> row3 = new ArrayList<Cell>();
		ArrayList<Cell> row4 = new ArrayList<Cell>();
		ArrayList<Cell> row5 = new ArrayList<Cell>();

		board.add(row1);
		board.add(row2);
		board.add(row3);
		board.add(row4);
		board.add(row5);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				board.get(i).add(new Cell(0, j, 0));
			}
		}

		for (int i = 0; i < 5; i++) {
			board.get(0).get(i).setVal(1);
		}

		board.get(1).get(4).setVal(1);

		for (int i = 0; i < 5; i++) {
			board.get(2).get(i).setVal(1);
		}

		board.get(3).get(0).setVal(1);

		for (int i = 0; i < 5; i++) {
			board.get(4).get(i).setVal(1);
		}
		
		Solver solve = new Solver();
		
		solve.findPath(board,0,0,0,0,4,4);

		print(board);

	}

	public static void print(ArrayList<ArrayList<Cell>> board) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(board.get(i).get(j).getVal());
			}
			System.out.println("\n");
		}
		return;
	}
}