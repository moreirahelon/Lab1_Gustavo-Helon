class Money {
	
	
	public Money() {
		
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
	
	public int getAmount() {
		set_amount(5);
		
		return get_amount();
	}
	
	public void setAmount(int amount) { 
		this.set_amount(amount);
		
	} //setAmount 	Inicialização
	
	public String getCurrency() {
		_currency = "USD";
		
		return _currency;
	}
	
	public void setCurrency(String currency) { 
		this._currency = currency;
	} //setCurrency  Inicialização
	
	public int get_amount() {
		return _amount;
	}

	public void set_amount(int _amount) {
		this._amount = _amount;
	}
	private int _amount; private String _currency;
} //Class Money