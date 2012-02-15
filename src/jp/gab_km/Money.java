package jp.gab_km;

public class Money {
	protected int amount;
	protected String currency;
	
	Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}

	public boolean equals(Object object){
		Money money = (Money) object;
		return amount == money.amount
				&& currency().equals(money.currency());
	}
	
	Money times(int multiplier){
		return new Money(amount * multiplier, currency);
	}

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	
	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
	
	String currency(){
		return currency;
	}
	
	public String toString() {
		return amount + " " + currency;
	}

	public Money plus(Money addend) {
		return new Money(amount + addend.amount, currency);
	}

}
