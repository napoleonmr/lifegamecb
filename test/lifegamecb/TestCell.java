package lifegamecb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCell {
	
	//Any live cell with fewer than two live neighbours dies, 
	//as if by underpopulation.


	@Test
	void liveCelWithOnethanLiveNeighboursDies() {
		
		Cell c= new Cell(true,1 );
		c.tick();
		assertFalse( c.getStatus());
		
	}

	@Test
	void liveCelWithZerothanLiveNeighboursDies() {
		
		Cell c= new Cell(true,0 );
		c.tick();
		assertFalse( c.getStatus());
		
	}
	
	//Any live cell with two or three live neighbours lives on to the next generation
	
	@Test
	void liveCellWithTwoOrThreeLiveNeighboursLives () {
		
		Cell c= new Cell(true,2 );
		c.tick();
		assertTrue( c.getStatus());
		
	}
}
