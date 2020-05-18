package lifegamecb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestUniverse {

	// The universe of the Game of Life is an infinite,
	// two-dimensional orthogonal grid of square cells

	@Test
	void TheUniverseOfTheGameOfLifeTwoDimensionalGridOfCells() {
		boolean[][] seed = { { true, true }, { false, false } };
		Universe universe = new Universe(seed);
		assertTrue(universe.getCell(0, 0) instanceof Cell);

	}

	// each of which is in one of two possible states, live or dead
	@Test
	void EachOfWhitchIsOneOfTwoPossibleStates() {
		boolean[][] seed = { { true, true }, { false, false } };
		Universe universe = new Universe(seed);
		assertTrue(universe.getCell(0, 0).getStatus());

	}
	// Every cell interacts with its eight neighbours, which are the cells that are
	// horizontally, vertically, or diagonally adjacent.

	void EveryCellInteracsWithItsEightNeighbours() {
		boolean[][] seed = { { true, true, true }, { false, false, false }, { false, false, false } };
		Universe universe = new Universe(seed);
		int neighboursNumberCell = universe.getNeighbours(1, 1);

		assertEquals(neighboursNumberCell, 3);

	}

}
