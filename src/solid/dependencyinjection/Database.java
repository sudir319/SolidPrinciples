package solid.dependencyinjection;

// this is the abstract layer
public interface Database {
	public void connect();
	public void disconnect();
}
