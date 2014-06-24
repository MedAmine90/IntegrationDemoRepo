package edu.esprit.integration.demo.tests;

import org.junit.*;
import edu.esprit.integration.demo.services.CalculatorService;
import static org.junit.Assert.*;

public class CalculatorTest {
	
	private CalculatorService calc;
	@Before
    public void setUp(){
        calc = new CalculatorService();
    }

	@Test
	public void shouldReturnSix(){
		assertEquals(6, calc.soustraction(7, 1));
	}
	@Test
	public void shouldReturnTen(){
		assertEquals(10, calc.addition(5, 5));
	}
	@Test
	public void shouldReturnSeventyseven(){
		assertEquals(77, calc.multiplication(7, 11));
	}
	@Test
	public void shouldReturnThree(){
		assertEquals(3, calc.division(9, 3));
	}

}
