package test;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		System.out.println("lab7_1 : 용동중");
		Stack<Integer> stack = new Stack<Integer>();
		Scanner input = new Scanner(System.in);

		System.out.println("1:삽입 2:삭제 3:조회 4:합계 5:종료");
		int menu = 0;
		int element = 0;
		int sum = 0;
		do {
			menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.print("정수 입력 :");
				element = input.nextInt();
				stack.push(element);
				break;
			case 2:
				System.out.print("맨 위의 값을 삭제 :");
				System.out.println(stack.pop());
				break;
			case 3:
				System.out.println("스택을 조회합니다.");
				System.out.println(stack.peek());
				break;
			case 4:
				System.out.println("스택이 빌 때 까지 출력합니다.");
				while(!stack.isEmpty()) {
					sum += stack.pop();					
				}
				System.out.println(sum);
				break;
			}
		}while(menu != 5);


	}

}
/*
java.util 패키지의 Stack 클래스를 이용하는 프로그램을 작성하시오.

- Stack 클래스를 정의하면 안되고, import 할 것

- StackTest 클래스의 main 메소드는 다음을 수행한다.

(1) Integer 자료를 저장할 Stack 객체 생성(stack이라고 부르자.) ** raw type 사용 금지

(2) 메뉴 5를 선택할 때까지 다음과 같은 메뉴를 반복하여 제공

1:삽입 2:삭제 3:조회 4:합계 5:종료

1 선택시 사용자로부터 정수값을 하나 입력받아 스택에 삽입(push)
2 선택시 스택에서 삭제(pop)하여 리턴된 값을 출력
3 선택시 스택에서 조회(peek)하여 리턴된 값을 출력
4 선택시 스택이 텅 빌때(empty)까지 모두 삭제(pop)하여 합을 출력

- 스택이 비어있을 때 합계를 구하면 0이 출력되어야 함

- 예외를 잡아서 처리하지 말 것
  예외 발생시 프로그램이 비정상 종료하도록 그대로 두는 대신,
  스택이 비어있을 때 삭제해보고, 어떤 예외가 발생하는지 확인해 볼 것
  스택이 비어있을 때 조회해보고, 어떤 예외가 발생하는지 확인해 볼 것
 */