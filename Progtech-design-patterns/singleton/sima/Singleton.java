package singleton.sima;

public class Singleton {
	private static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	//Methods
	public String getDescription() {
		return "I'm a classic Singleton!";
	}
}
