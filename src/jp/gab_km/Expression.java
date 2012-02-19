package jp.gab_km;

public interface Expression {
	Money reduce(Bank gank, String to);
	Expression plus(Expression addend);
}
