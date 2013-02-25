package Main;

public class Cell {

	int i;
	int j;
	int val;
	
	public Cell(int i, int j, int val){
		this.i = i;
		this.j = j;
		this.val = val;
	}
	public int getI() {
		return i;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + j;
		result = prime * result + val;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (i != other.i)
			return false;
		if (j != other.j)
			return false;
		if (val != other.val)
			return false;
		return true;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
}
