package solid.interfaceseggregation.exercise;

public class App {

	public static void main(String[] args) {
		
		ICEO ceo = new CEO();
		
		ceo.addBonus();
		ceo.salary();
		ceo.makeDecisions();
		ceo.addStocks();
		
	}
}
