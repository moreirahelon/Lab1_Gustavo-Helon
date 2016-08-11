class Money {	
	public Money() {
		this._amount = 0;
  		this._currency = "BRL";		
	}
	public Money(int amount, String currency){
		MoneySetUp(amount, currency);
	}
	
	public void MoneySetUp(int amount, String currency){
		this._amount = amount;
  		this._currency = currency;
	}
	
	public Money add(Money m) { 
		Money money = new Money();		
		money.setAmount(this.getAmount() + m.getAmount()); 
		money.setCurrency(this.getCurrency());		
		return money;
	}	
	public void setAmount(int amount) { 
		this.set_amount(amount);
		
	} //setAmount 	Inicialização
	
	public String getCurrency() {		
		return _currency;
	}
	
	public void setCurrency(String currency) { 
		this._currency = currency;
	} //setCurrency  Inicialização
	
	public int getAmount() {
		return _amount;
	}

	public void set_amount(int _amount) {
		this._amount = _amount;
	}
	private int _amount; private String _currency;
} //Class Money