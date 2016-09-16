package bowlingKata.bowlingKata;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

	BowlingGame game;
	
	@Before
	public void setup(){
	game = new BowlingGame();
	}
	
	@Test
	public void canRollBall(){
		game.roll(0);
	}
	
	@Test
	public void canRollAllOnes(){
		for(int i=0;i<20;i++){
			game.roll(1);
		}
		assertEquals(20, game.getScore());
	}
	
	@Test
	public void canScoreSpareFollowedByThree(){
		game.roll(5,5);
		game.roll(3);
		
		assertEquals(16,game.getScore());
	}
	
	@Test
	public void canScoreStrike(){
		game.roll(10);
		game.roll(5,2);
		assertEquals(24, game.getScore());	
	}
	
	@Test
	public void canScorePerfectGame(){
		game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
		assertEquals(300, game.getScore());
	}
	
}

