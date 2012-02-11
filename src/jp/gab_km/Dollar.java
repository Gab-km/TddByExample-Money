package jp.gab_km;

public class Dollar {

	public int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public void times(int i) {
		amount = amount * 2;
	}

}
