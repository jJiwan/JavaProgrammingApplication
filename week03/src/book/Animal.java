package book;

public class Animal {
	String eye;
	String mouth;

	void eat(String food) {
		System.out.println(food + "를(을) 냠냠");
	}

	void sleep() {
		System.out.println("쿨쿨 zZZ~");
	}
}

class Eagle extends Animal {
	String wing;

	void fly() {
		System.out.println("날아 갑니다");
	}
}

class Tiger extends Animal {
	String leg;

	void run() {
		System.out.println("질주 합니다");
	}
}

class Goldfish extends Animal {
	String fin;

	void swim() {
		System.out.println("헤엄을 칩니다");
	}
}