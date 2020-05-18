package lifegamecb;

public class Cell {

	private boolean status;
	private int neighbours;

	public Cell(boolean status, int neighbours) {
		this.status = status;
		this.neighbours = neighbours;
	}

	public void tick() {
		if ( neighbours < 2)
			this.status = false;
		
	}

	public boolean getStatus() {
		
		return this.status;
	}

}