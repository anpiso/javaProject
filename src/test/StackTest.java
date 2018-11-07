package test;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		System.out.println("lab7_1 : �뵿��");
		Stack<Integer> stack = new Stack<Integer>();
		Scanner input = new Scanner(System.in);

		System.out.println("1:���� 2:���� 3:��ȸ 4:�հ� 5:����");
		int menu = 0;
		int element = 0;
		int sum = 0;
		do {
			menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.print("���� �Է� :");
				element = input.nextInt();
				stack.push(element);
				break;
			case 2:
				System.out.print("�� ���� ���� ���� :");
				System.out.println(stack.pop());
				break;
			case 3:
				System.out.println("������ ��ȸ�մϴ�.");
				System.out.println(stack.peek());
				break;
			case 4:
				System.out.println("������ �� �� ���� ����մϴ�.");
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
java.util ��Ű���� Stack Ŭ������ �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.

- Stack Ŭ������ �����ϸ� �ȵǰ�, import �� ��

- StackTest Ŭ������ main �޼ҵ�� ������ �����Ѵ�.

(1) Integer �ڷḦ ������ Stack ��ü ����(stack�̶�� �θ���.) ** raw type ��� ����

(2) �޴� 5�� ������ ������ ������ ���� �޴��� �ݺ��Ͽ� ����

1:���� 2:���� 3:��ȸ 4:�հ� 5:����

1 ���ý� ����ڷκ��� �������� �ϳ� �Է¹޾� ���ÿ� ����(push)
2 ���ý� ���ÿ��� ����(pop)�Ͽ� ���ϵ� ���� ���
3 ���ý� ���ÿ��� ��ȸ(peek)�Ͽ� ���ϵ� ���� ���
4 ���ý� ������ �� ����(empty)���� ��� ����(pop)�Ͽ� ���� ���

- ������ ������� �� �հ踦 ���ϸ� 0�� ��µǾ�� ��

- ���ܸ� ��Ƽ� ó������ �� ��
  ���� �߻��� ���α׷��� ������ �����ϵ��� �״�� �δ� ���,
  ������ ������� �� �����غ���, � ���ܰ� �߻��ϴ��� Ȯ���� �� ��
  ������ ������� �� ��ȸ�غ���, � ���ܰ� �߻��ϴ��� Ȯ���� �� ��
 */