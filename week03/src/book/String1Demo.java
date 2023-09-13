package book;

public class String1Demo {
	public static void main(String[] args) {
		String s1 = "Hi, Java!";
		String s2 = "Hi, Java!";
		String s3 = new String("Hi, Java!");
		String s4 = new String("Hi, Java!");

//		System.out.println("s1 == s2 -> " + (s1 == s2));
		System.out.println("s1 == s3 -> " + (s1 == s3));
		System.out.println(s1.equals(s3));  // 두 변수가 가르키는 곳의 문자열이 일치
//		System.out.println("s3 == s4 -> " + (s3 == s4));

//		s1 = s3;
//		System.out.println("s1 == s3 -> " + (s1 == s3));
	}
}