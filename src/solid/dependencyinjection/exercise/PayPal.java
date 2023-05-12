package solid.dependencyinjection.exercise;

//low level modules
public class PayPal implements PaymentMethod {

	@Override
	public void pay() {
		System.out.println("Paying with PayPal...");
	}
}
