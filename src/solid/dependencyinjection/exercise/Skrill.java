package solid.dependencyinjection.exercise;

//low level modules
public class Skrill implements PaymentMethod {

	@Override
	public void pay() {
		System.out.println("Paying with Skrill...");
	}
}
