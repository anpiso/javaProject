package test;
import java.util.Scanner;

public class RecursionTest {
	public static void main(String[] args) {
		System.out.println("course2 : 용동중");

		Scanner input = new Scanner(System.in);
		System.out.print("양의 정수 입력: ");
		int number = input.nextInt();

		System.out.println(sum(number));
		System.out.println(iterativeSum(number));

		System.out.println(factorial(number));
		System.out.println(iterativeFactorial(number));

		f(number);
		System.out.println();

		g(number);
		System.out.println();
	}


	// (1) 반복 알고리즘을 이용하여 1부터 n까지의 합을 구하는 메소드
	private static int iterativeSum(int n) {
		int result = 0;
		for(int i = 0; i <= n; i++) {
			result += i;
		}
		return result;
		}

	// 재귀 알고리즘을 이용하여 1부터 n까지의 합을 구하는 메소드
	private static int sum(int n) {
		if(n <= 0)
			return 0;
		else
			return n + sum(n-1);
	} 

	// 반복 알고리즘을 이용하여 1부터 n까지의 곱을 구하는 메소드
	private static int iterativeFactorial(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	// (2) 재귀 알고리즘을 이용하여 1부터 n까지의 곱을 구하는 메소드
	private static int factorial(int n) {
		if(n <= 1)
			return 1;
		else
			return n * factorial(n-1);
	}

	// 재귀 알고리즘을 이용하여 n 부터 1까지 출력하는 메소드
	private static void f(int n) {
		if(n > 0) {
			System.out.print(n + " ");
			f(n-1);
		}
	}

	// (3) 재귀 알고리즘을 이용하여 1 부터 n까지 출력하는 메소드
	private static void g(int n) {
		if(n > 0) {
			g(n-1);
			System.out.print(n + " ");
		}
		
		
	}

}
/*
----------------------------------------------------------
아래 코드는 간단한 재귀 알고리즘을 연습하는 프로그램이다.
이 코드를 실행시켜 보고 이해한 후, (1), (2), (3)의 메소드를 완성하시오.

- 0이나 음수를 입력하는 경우는 고려하지 않아도 됨

- 실행 예:

course2 : 홍길동
양의 정수 입력: 4

1부터 4까지의 합(반복) = 10
1부터 4까지의 합(재귀) = 10

1부터 4까지의 곱(반복) = 24
1부터 4까지의 곱(재귀) = 24

4부터 1까지 출력 = 4 3 2 1
1부터 4까지 출력 = 1 2 3 4

----------------------------------------------------------
목적
- recursive algorithm을 이해한다.

----------------------------------------------------------
유의사항
- 적절한 comment
//***************************
// 파일명: ... .java
// 작성자: ...
// 작성일: ...
// 프로그램 설명:...
//***************************

- 들여쓰기
- 식별자 이름을 자바 관례에 맞게 적절히 붙일 것
- command-line에서 java -jar 과제코드.jar 로 채점합니다.
철자도 똑같게 이 명령이 제대로 실행되어야 합니다.
- 과제명과 본인의 이름을 맨 처음 출력

----------------------------------------------------------
제출 
- 과제코드.jar 파일
- .java 파일들




import java.util.Scanner;

public class RecursionTest {
 public static void main(String[] args) {
  System.out.println("course2 : 홍길동");

  Scanner input = new Scanner(System.in);
  System.out.print("양의 정수 입력: ");
  int number = input.nextInt();

  System.out.println(sum(number));
  System.out.println(iterativeSum(number));

  System.out.println(factorial(number));
  System.out.println(iterativeFactorial(number));

  f(number);
  System.out.println();

  g(number);
  System.out.println();
 }


 // (1) 반복 알고리즘을 이용하여 1부터 n까지의 합을 구하는 메소드
 private static int iterativeSum(int n) {
  return 0;
 }

 // 재귀 알고리즘을 이용하여 1부터 n까지의 합을 구하는 메소드
 private static int sum(int n) {
  if(n <= 0)
   return 0;
  else
   return n + sum(n-1);
 } 

 // 반복 알고리즘을 이용하여 1부터 n까지의 곱을 구하는 메소드
 private static int iterativeFactorial(int n) {
  int result = 1;
  for(int i = 1; i <= n; i++) {
   result *= i;
  }
  return result;
 }

 // (2) 재귀 알고리즘을 이용하여 1부터 n까지의 곱을 구하는 메소드
 private static int factorial(int n) {
  return 0;
 }

 // 재귀 알고리즘을 이용하여 n 부터 1까지 출력하는 메소드
 private static void f(int n) {
  if(n > 0) {
   System.out.print(n + " ");
   f(n-1);
  }
 }

 // (3) 재귀 알고리즘을 이용하여 1 부터 n까지 출력하는 메소드
 private static void g(int n) {

 }

}*/