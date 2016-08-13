import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MoneyTest {
    private Money M_5_USD;
    private Money M_15_USD;
    private Money M_10_CHF;
    private Money M_40_BRL;

    @Before
    public void setUp() {
    	M_5_USD = new Money(5, "USD");
    	M_15_USD = new Money(15, "USD");
    	M_10_CHF = new Money(10, "CHF");
    	M_40_BRL = new Money(40, "BRL");
    }   

	@Test
	public void testAddTrue() {
		M_5_USD = M_5_USD.add(M_15_USD);
		assertTrue(M_5_USD.getAmount() == 20);
	}
	@Test
	//caso as duas moedas sao diferentes
	public void testAddDifferentCurrency() {
		MoneyBag mb = new MoneyBag();
		mb = M_5_USD.add(M_10_CHF);
		assertTrue(mb.getmoney().contains(M_5_USD));
		assertTrue(mb.getmoney().contains(M_10_CHF));
	}
	@Test
	public void testAddEquals() {
		M_5_USD = M_5_USD.add(M_15_USD);
		assertEquals(M_5_USD.getAmount(),20);
	}
	@Test
	public void testMoneyBagAdd(){
		MoneyBag mb = new MoneyBag();
		mb.addMoney(M_5_USD);
		assertEquals(mb.getmoney().get(0).getAmount(), 5);
		assertTrue(mb.getmoney().get(0).getCurrency().getStringCurrency() == "USD");
	}
	@Test
	//testar moneybagtotal
	public void testMoneyBagTotal(){
		MoneyBag mb = new MoneyBag();
		mb.addMoney(M_5_USD);
		mb.addMoney(M_40_BRL);
		mb.addMoney(M_10_CHF);
		assertEquals(mb.MoneyTotal(), 75);
	}
	@Test
	//caso vazio
	public void testMoneyBagTotalEmpty(){
		MoneyBag mb = new MoneyBag();
		assertEquals(mb.MoneyTotal(), 0);
	}
}