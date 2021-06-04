package cs350s21project.cli;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class testError {


	@Test
	void testError() {
		
		
		
		Bomb bomb1 = new Bomb(0, 0, 0, 0, Bomb.E_ErrorType.NONE, 10, 0, 0);
		Bomb bomb2 = new Bomb(0, 0, 0, 0, Bomb.E_ErrorType.UNIFORM, 10, 0, 0);
		Bomb bomb3 = new Bomb(0, 0, 0, 0, Bomb.E_ErrorType.GAUSSIAN, 10, 0, 0);

		assertEquals(10.0, bomb1.getErrorRange());
		assertEquals(10.0, bomb2.getErrorRange());
		assertEquals(10.0, bomb3.getErrorRange());
		
		
		assertEquals(Bomb.E_ErrorType.NONE, bomb1.getErrorType());
		assertEquals(Bomb.E_ErrorType.UNIFORM, bomb2.getErrorType());
		assertEquals(Bomb.E_ErrorType.GAUSSIAN, bomb3.getErrorType());
		
	}
	


}
