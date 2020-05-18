package lifegamecb;

public class Universe {

	private Cell[][] cellMatrix;

	public Universe(boolean[][] seed) {
		cellMatrix = new Cell[seed.length][seed[0].length];
		for (int i = 0; i < seed.length; i++) {
			for (int j = 0; j < seed[0].length; j++) {
				Cell cell = new Cell(seed[i][j], 0);
				cellMatrix[i][j] = cell;
			}
		}
	}

	public Cell getCell(int i, int j) {
		return cellMatrix[i][j];
	}

}
