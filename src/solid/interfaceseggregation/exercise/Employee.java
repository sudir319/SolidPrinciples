package solid.interfaceseggregation.exercise;

public class Employee implements IEmployee {

	@Override
	public void salary() {
		System.out.println("Getting the salary...");
	}
}
