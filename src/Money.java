import java.util.ArrayList;

public class Money {
	public static void main(String[] args){
		
		
		//************************
		
		
		
		
		
		
		
		
		//CRIAR A PORRA DA MAIN, O ITEM 9
		
		
		
		
		
		
		
		
		//************************
		
		
		
		
		
		
	}
	private int _amount; 
	private Currency _currency;
	public Money() {
		this._amount = 0;
  		this._currency = new Currency();		
	}
	public Money(int amount, String currency){
		MoneySetUp(amount, currency);
	}
	
	public void MoneySetUp(int amount, String currency){
		this._amount = amount;
  		this._currency = new Currency(currency);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T add(Money m) {
		T t;
		if (this.getCurrency().getStringCurrency() == m.getCurrency().getStringCurrency()){
			Money money = new Money();		
			money.setAmount(this.getAmount() + m.getAmount()); 
			money.setCurrency(this.getCurrency());		
			t = (T)money;
			return t;
		}
		else{
			MoneyBag mb = new MoneyBag();
			mb.addMoney(this);
			mb.addMoney(m);
			t = (T)mb;
			return t;
		}
	}	
	public void setAmount(int amount) { 
		this.set_amount(amount);
		
	} //setAmount 	Inicialização
	
	public Currency getCurrency() {		
		return _currency;
	}
	
	public void setCurrency(Currency currency) { 
		this._currency = currency;
	} //setCurrency  Inicialização
	
	public int getAmount() {
		return _amount;
	}

	public void set_amount(int _amount) {
		this._amount = _amount;
	}
} //Class Money

class Currency{
	private String _currency;
	Currency(String currency){
		this._currency = currency;
	}	
	Currency(){
		this._currency = "BRL";
	}
	public void setCurrency(String currency){
		this._currency = currency;
	}
	public String getStringCurrency(){
		return this._currency;
	}
	
}
class MoneyBag{
	private ArrayList<Money> _money;
	MoneyBag(){
		_money = new ArrayList<Money>();
	}
	public void addMoney(Money m){
		if(m!= null)
			_money.add(m);
	}
	public ArrayList<Money> getmoney(){
		if (_money != null)
			return this._money;
		else
			return new ArrayList<Money>();
	}
	public int MoneyTotal(){
		int result;
		result = 0;
		int i;
		for (i = 0; i < _money.size(); i++){
			//supondo que as unicas moedas sao USD, CHF E BRL
			if(_money.get(i).getCurrency().getStringCurrency() == "USD")
				result = result + 3*_money.get(i).getAmount();
			if(_money.get(i).getCurrency().getStringCurrency() == "CHF")
				result = result + 2*_money.get(i).getAmount();
			if(_money.get(i).getCurrency().getStringCurrency() == "BRL")
				result = result + _money.get(i).getAmount();
		}
		return result;
	}
}