package test;
import java.util.Scanner;

public class RecursionTest {
	public static void main(String[] args) {
		System.out.println("course2 : �뵿��");

		Scanner input = new Scanner(System.in);
		System.out.print("���� ���� �Է�: ");
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


	// (1) �ݺ� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
	private static int iterativeSum(int n) {
		int result = 0;
		for(int i = 0; i <= n; i++) {
			result += i;
		}
		return result;
		}

	// ��� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
	private static int sum(int n) {
		if(n <= 0)
			return 0;
		else
			return n + sum(n-1);
	} 

	// �ݺ� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
	private static int iterativeFactorial(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	// (2) ��� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
	private static int factorial(int n) {
		if(n <= 1)
			return 1;
		else
			return n * factorial(n-1);
	}

	// ��� �˰����� �̿��Ͽ� n ���� 1���� ����ϴ� �޼ҵ�
	private static void f(int n) {
		if(n > 0) {
			System.out.print(n + " ");
			f(n-1);
		}
	}

	// (3) ��� �˰����� �̿��Ͽ� 1 ���� n���� ����ϴ� �޼ҵ�
	private static void g(int n) {
		if(n > 0) {
			g(n-1);
			System.out.print(n + " ");
		}
		
		
	}

}
/*
----------------------------------------------------------
�Ʒ� �ڵ�� ������ ��� �˰����� �����ϴ� ���α׷��̴�.
�� �ڵ带 ������� ���� ������ ��, (1), (2), (3)�� �޼ҵ带 �ϼ��Ͻÿ�.

- 0�̳� ������ �Է��ϴ� ���� ������� �ʾƵ� ��

- ���� ��:

course2 : ȫ�浿
���� ���� �Է�: 4

1���� 4������ ��(�ݺ�) = 10
1���� 4������ ��(���) = 10

1���� 4������ ��(�ݺ�) = 24
1���� 4������ ��(���) = 24

4���� 1���� ��� = 4 3 2 1
1���� 4���� ��� = 1 2 3 4

----------------------------------------------------------
����
- recursive algorithm�� �����Ѵ�.

----------------------------------------------------------
���ǻ���
- ������ comment
//***************************
// ���ϸ�: ... .java
// �ۼ���: ...
// �ۼ���: ...
// ���α׷� ����:...
//***************************

- �鿩����
- �ĺ��� �̸��� �ڹ� ���ʿ� �°� ������ ���� ��
- command-line���� java -jar �����ڵ�.jar �� ä���մϴ�.
ö�ڵ� �Ȱ��� �� ����� ����� ����Ǿ�� �մϴ�.
- ������� ������ �̸��� �� ó�� ���

----------------------------------------------------------
���� 
- �����ڵ�.jar ����
- .java ���ϵ�




import java.util.Scanner;

public class RecursionTest {
 public static void main(String[] args) {
  System.out.println("course2 : ȫ�浿");

  Scanner input = new Scanner(System.in);
  System.out.print("���� ���� �Է�: ");
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


 // (1) �ݺ� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
 private static int iterativeSum(int n) {
  return 0;
 }

 // ��� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
 private static int sum(int n) {
  if(n <= 0)
   return 0;
  else
   return n + sum(n-1);
 } 

 // �ݺ� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
 private static int iterativeFactorial(int n) {
  int result = 1;
  for(int i = 1; i <= n; i++) {
   result *= i;
  }
  return result;
 }

 // (2) ��� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
 private static int factorial(int n) {
  return 0;
 }

 // ��� �˰����� �̿��Ͽ� n ���� 1���� ����ϴ� �޼ҵ�
 private static void f(int n) {
  if(n > 0) {
   System.out.print(n + " ");
   f(n-1);
  }
 }

 // (3) ��� �˰����� �̿��Ͽ� 1 ���� n���� ����ϴ� �޼ҵ�
 private static void g(int n) {

 }

}*/