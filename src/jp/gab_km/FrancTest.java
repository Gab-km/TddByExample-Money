package jp.gab_km;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrancTest {
	
	@Test
	public void testFrancMultiplication(){
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}
	
	@Test
	public void testEquality(){
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		assertFalse(Money.dollar(5).equals(new Franc(5)));
	}

}
