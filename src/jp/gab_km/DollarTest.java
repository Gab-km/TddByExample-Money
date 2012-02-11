package jp.gab_km;

import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTest {

	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}
	
	@Test
	public void testEquality(){
		assertTrue(Money.dollar(5).equals(new Dollar(5)));
		assertFalse(Money.dollar(5).equals(new Dollar(6)));
		assertFalse(new Franc(5).equals(new Dollar(5)));
	}

}
