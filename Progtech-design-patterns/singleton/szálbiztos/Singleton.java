package singleton.szálbiztos;

public class Singleton {
	private static Singleton uniqueInstance;
 
	// Other variables
 
	private Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// Other methods
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
