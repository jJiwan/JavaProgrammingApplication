package sec05;

public class LocalClassDemo {
	private String s1 = "외부";

	void method() {
		int x = 1;
		class LocalClass {
			String s2 = "INNER";
			String s3 = s1;

			public void show() {
				System.out.println("LOCAL CLASS");
				// x = 2;
			}
		}

		LocalClass lc = new LocalClass();
		System.out.println(lc.s2);
		lc.show();
	}

	public static void main(String[] args) {
		LocalClassDemo lcd = new LocalClassDemo();
		lcd.method();
	}
}