import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MoneyTest {
    private Money M_5_USD;
    private Money M_15_USD;
    private Money M_10_CHF;
    private Money M_78_EUR;
    private Money M_40_BRL;

    @Before
    public void setUp() {
    	M_5_USD = new Money(5, "USD");
    	M_15_USD = new Money(15, "USD");
    	M_10_CHF = new Money(10, "CHF");
    	M_78_EUR = new Money(78, "EUR");
    	M_40_BRL = new Money(40, "BRL");
    }   

	@Test
	public void testAddTrue() {
		Money MyMoney = new Money();
		M_5_USD = M_5_USD.add(M_15_USD);
		assertTrue(M_5_USD.getAmount() == 20);
	}
	@Test
	public void testAddEquals() {
		Money MyMoney = new Money();
		M_5_USD = M_5_USD.add(M_15_USD);
		assertEquals(M_5_USD.getAmount(),20);
	}

}