package staticex;

public class Company {

	private static Company instance = new Company();

	private Company() {
	}

	public static Company getInstance() { // Class에서 바로 호출위해 static 선언
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}

}
