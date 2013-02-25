package Main;

import java.util.ArrayList;

public class Solver {

	ArrayList<Cell> path = new ArrayList<Cell>();

	public void findPath(ArrayList<ArrayList<Cell>> board, int currI,
			int currJ, int startI, int startJ, int endI, int endJ) {
		// TODO Auto-generated method stub

		if (0 > startI || startI > board.get(0).size() || 0 > startJ
				|| startJ > board.size() || 0 > endI
				|| endI > board.get(0).size() || 0 > endJ
				|| endJ > board.size()) {
			System.out.println("Start or end position invalid");
			return;
		}

		if (currI > 4) {
			return;
		}
		if (currJ > 4) {
			return;
		}

		if (currI < 0) {
			return;
		}
		if (currJ < 0) {
			return;
		}

		if (board.get(currI).get(currJ).getVal() == 0) {
			return;
		}

		if (board.get(endI).get(endJ) == board.get(currI).get(currJ)) {
			System.out.println("Answer Found");

			return;
		}

		for (int i = 0; i < path.size(); i++) {
			if(path.get(i).i == currI && path.get(i).j == currJ){
				return;
			}
		}

		if (board.get(currI).get(currJ).getVal() == 1) {
			path.add(board.get(currI).get(currJ));
		}

		// board.get(currI).get(currJ).setVal(0);

		findPath(board, currI + 1, currJ, startI, startJ, endI, endJ);
		findPath(board, currI, currJ + 1, startI, startJ, endI, endJ);
		findPath(board, currI, currJ - 1, startI, startJ, endI, endJ);
		findPath(board, currI - 1, currJ, startI, startJ, endI, endJ);
		return;

	}

}