package lifegamecb;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestUniverse {

	//	The universe of the Game of Life is an infinite,
	//	two-dimensional orthogonal grid of square cells

	@Test
	void TheUniverseOfTheGameOfLifeTwoDimensionalGridOfCells() {
		boolean[][] seed = {{true,true},{false,false}};
		Universe universe = new Universe(seed);
		assertTrue(universe.getCell(0,0) instanceof Cell);

	}

	//each of which is in one of two possible states, live or dead
	@Test
	void EachOfWhitchIsOneOfTwoPossibleStates() {
		boolean[][] seed = {{true,true},{false,false}};
		Universe universe = new Universe(seed);
		assertTrue(universe.getCell(0,0).getStatus());

	}
	
}
