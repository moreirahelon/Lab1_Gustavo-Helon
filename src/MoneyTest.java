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
        M_5_USD.MoneySetUp(5, "USD");
        M_15_USD.MoneySetUp(15, "USD");
        M_10_CHF.MoneySetUp(10, "CHF");
        M_78_EUR.MoneySetUp(78, "EUR");
        M_40_BRL.MoneySetUp(40, "BRL");
    }
    
	@Test
	public void testMoney() {
	}

	@Test
	public void testAdd() {
		Money MyMoney = new Money();
		
		MyMoney.add(MyMoney);
		assertTrue(MyMoney.equals(M_5_USD));
		assertTrue(!MyMoney.equals(M_15_USD));
		
		assertEquals(5,MyMoney.get_amount() );
	}

	@Test
	public void testGetAmount() {
	}

	@Test
	public void testSetAmount() {
	}

	@Test
	public void testGetCurrency() {
	}

	@Test
	public void testSetCurrency() {
	}

}