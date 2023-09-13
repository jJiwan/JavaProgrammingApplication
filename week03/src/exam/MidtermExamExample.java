package exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
에버랜드 매표소 직원은 방문한 고객들의 나이를 계산하여 총 금액을 알려준다.
(단, 방문 고객의 단위는 정해져 있지 않다)
요금은 어른 20000원, 청소년 10000원, 어린이 5000원이다.
(8세 미만은 어린이, 8세 이상 19세까지는 청소년, 20세 이상은 어른)

프로그램 실행 예시
몇 분이세요? 3
1번분 나이 : 29
2번분 나이 : 31
3번분 나이 : 7
고객님 총 요금은 45000원 입니다.

 */
public class MidtermExamExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.print("몇 분이세요? ");
        int humans = scanner.nextInt();  // 고객 수
        int total = 0;  // 총 요금

        for(int i=0; i<humans; i++){
            System.out.print(i+1);
            System.out.print("번분 나이 입력 : ");
            ages.add(scanner.nextInt()); // 나이를 입력 받아 ages ArrayList에 추가
        }

        for(int i=0; i<humans; i++){
            int age = ages.get(i);

            if(age > 19)
                total = total + 20000;
            //else if(age <= 19 && age >= 8)
            else if(age >= 8)
                total = total + 10000;
            else
                total = total + 5000;
        }
        System.out.println("고객님 총 요금은 " + total + "원 입니다.");
    }
}
