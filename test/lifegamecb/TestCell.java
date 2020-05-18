package lifegamecb;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class TestCell {

	// Any live cell with fewer than two live neighbours dies,
	// as if by underpopulation.

	@Test
	void liveCelWithOnethanLiveNeighboursDies() {

		Cell c = new Cell(true, 1);
		c.tick();
		assertFalse(c.getStatus());// comentario prueba

	}

}
