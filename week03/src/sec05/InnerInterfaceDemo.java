package sec05;

class Icon {
	interface Touchable {
		void touch();
	}
}

public class InnerInterfaceDemo implements Icon.Touchable {
	@Override
	public void touch() {
		System.out.println("TOUCH ICON!");
	}

	public static void main(String[] args) {
		Icon.Touchable btn = new InnerInterfaceDemo();
		btn.touch();
	}
}