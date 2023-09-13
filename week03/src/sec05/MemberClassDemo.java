package sec05;

public class MemberClassDemo {
	private String secret = "외부 클래스 private 필드";
	String s = "외부 클래스 필드";

	class MemberClass {  // 내부(inner) 멤버 클래스
		String s = "내부 클래스 필드";

		public void show1() {
			System.out.println("내부 메서드 show1!");
			System.out.println(secret);  // MemberClassDemo의 private 멤버 변수 secret 출력

			System.out.println(s); // MemberClass 인스턴스 변수 s를 출력

			System.out.println(MemberClassDemo.this.s);  // MemberClassDemo의 인스턴스 변수 s 출력
		}

		static String s3 = "내부 클래스 정적 필드";
		static void show2() {
			System.out.println("내부 클래스 정적 메서드");
		}
	}

	public static void main(String[] args) {
		MemberClassDemo m = new MemberClassDemo();
		MemberClass m1 = m.new MemberClass();

		System.out.println(MemberClass.s3);
		MemberClass.show2();

		System.out.println(m1.s);
		m1.show1();
	}
}