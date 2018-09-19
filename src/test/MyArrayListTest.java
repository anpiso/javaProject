package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class MyArrayList{
	private int[] arr;

	private int number;

	public MyArrayList() {

		this.arr = new int[10];

		this.number = 0;

	}
	public boolean add(int a) {
		if(number < 10) {
			arr[number] = a;
			number++;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		int[] arr2 = new int[number];

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
		}

		return Arrays.toString(arr2);

	}
	
	
	 //****** lab1_6 �� ���� �޼ҵ���� �߰�
     //get - �ε����� �Ű������� �޾� �迭�� �ش� �������� ����    O(1)
	public int get(int index) {
		return arr[index];
	}
     //size - ����Ʈ�� ���̸� ����(�迭 ũ�Ⱑ �ƴ�)    O(1)
	public int size() {
		return arr.length;
	}
     //add - �ε����� �������� �Ű������� �޾� �迭�� �ش� ��ġ�� �������� ����     O(n)
	public void add(int index, int a) {
		int swap;
		for (int i = 0; i < arr.length - index; i++) {
			swap = arr[index+1];
			arr[index+1] = arr[index];
			number++;
		}
		arr[index] = a;
	}
     //remove - �ε����� �Ű������� �޾� �迭�� �ش� ��ġ �������� �����ϰ� �� ���� ����   O(n)
	public int remove(int index) {
		int result = arr[index];
		for (int i = 0; i < arr.length-index-1; i++) {
			arr[index--] = arr[index];
		}
		return result;
	}



}
public class MyArrayListTest {

	public static void main(String[] args) {
		System.out.println("hw5_1: �뵿��");

		Scanner input = new Scanner(System.in);
		
		// (1) Integer�� Ÿ�� �Ű������� �Ͽ� ArrayList ��ü�� ����(list��� �̸��� ������ ����)
		MyArrayList list = new MyArrayList();
		// �ϼ��ϼ���.

		// (2) ����ڿ��� �޴��� �ݺ� �����ϰ� 7�� �Է��ϸ� �ݺ� ����
		int menu = 0;
		int index = 0;
		int element = 0;
		do {
			System.out.print(" 1:�ε�����ȸ 2:��ü��ȸ 3:������ȸ 4:���� 5:�ε������� 6:�ε������� 7:���� ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("�ε��� ��ġ�� ���Ұ��� ��ȸ�մϴ�.");
				System.out.print("�ε��� �Է�: ");
				index = input.nextInt();
				element = list.get(index); // �ϼ��ϼ���.
				System.out.println(element);  
				break;
			case 2:
				System.out.println("����Ʈ ��ü�� ��ȸ�մϴ�.");
				System.out.println(list.toString());   // �ϼ��ϼ���.
				break;
			case 3:
				System.out.println("����Ʈ ���̸� ��ȸ�մϴ�.");
				int size = list.size();  // �ϼ��ϼ���.
				System.out.println(size);
				break;
			case 4:
				System.out.println("���Ҹ� ����Ʈ�� �� �ڿ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				list.add(element);;  // �ϼ��ϼ���.
				break;
			case 5:
				System.out.println("�ε��� ��ġ�� ���Ҹ� �����մϴ�.");
				System.out.print("�ε��� �Է�: ");
				index = input.nextInt();    
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				list.add(index, element);    // �ϼ��ϼ���.
				break;
			case 6:
				System.out.println("�ε��� ��ġ�� ���Ҹ� �����մϴ�.");
				System.out.print("�ε��� �Է�: ");
				index = input.nextInt(); 
				element = list.remove(index); // �ϼ��ϼ���.
				System.out.println(element);
				break;
			case 7:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 7);

	}

}
/*
----------------------------------------------------------
������ ���� ���� ����Ʈ�� �����ϴ� MyArrayList Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

- MyArrayList Ŭ���� (lab1_6�� MyArrayList Ŭ������ ****** �κ� �޼ҵ���� �߰��ϸ� ��)
  �ʵ�(private �ν��Ͻ� ����):
        ���� �迭
        �迭�� ����� �׸��

  �޼ҵ�(public �޼ҵ�):
        �Ű������� ���� constuctor - ���� �迭 �ʵ带 ũ�Ⱑ 10�� �迭�� �ʱ�ȭ�ϰ�, �׸�� �ʵ�� 0���� �ʱ�ȭ
        ���� ���� �޼ҵ�(add) - �������� �Ű������� �޾� �迭�� ����
           ���� ������� �迭�� �պκк��� ä�� 
           ���Կ� �����ϸ� true ����
           �迭�� ���� ���� �������� ������, false�� ����      
        toString �������̵� - �迭�� ����� �׸� ��ü�� ���ڿ��� ���� 

        ****** lab1_6 �� ���� �޼ҵ���� �߰�
        get - �ε����� �Ű������� �޾� �迭�� �ش� �������� ����    O(1)
        size - ����Ʈ�� ���̸� ����(�迭 ũ�Ⱑ �ƴ�)    O(1)
        add - �ε����� �������� �Ű������� �޾� �迭�� �ش� ��ġ�� �������� ����     O(n)
        remove - �ε����� �Ű������� �޾� �迭�� �ش� ��ġ �������� �����ϰ� �� ���� ����   O(n)

- ����̹� Ŭ����(���� ��� MyArrayListTest Ŭ����)�� main �޼ҵ�� ������ ����

(1) MyArrayList ��ü�� ����(list��� ����)
(2) ����ڿ��� ������ ���� �޴��� �ݺ��Ͽ� �����ϵ� 7 �Է½� �ݺ� ����
   1:�ε�����ȸ 2: ��ü��ȸ 3:������ȸ 4:���� 5:�ε������� 6:�ε������� 7:����

1 ���ý�, ����ڷκ��� �ε����� �Է¹޾� list���� ���� ��ȸ�Ͽ� ���(get ȣ��)
2 ���ý�, list�� ��ü ������ ���(toString ȣ��)
3 ���ý�, list�� ���̸� ���(size ȣ��)
4 ���ý�, ����ڷκ��� �������� �Է¹޾� list�� ����(add ȣ��)
5 ���ý�, ����ڷκ��� �ε����� �������� �Է¹޾� list�� ����(add ȣ��) ** ����: �ݵ�� �ε���, ������ ������ �Է¹��� ��
6 ���ý�, ����ڷκ��� �ε����� �Է¹޾� list���� ���� �����Ͽ� ���(remove ȣ��)


** �ɼ�1: �ε����� ������ ����� �� IndexOutOfBoundsException ���� �߻��ϵ��� �� �� ��
          (�迭�� �ε����� �ƴ϶� ����Ʈ�� �ε����� ����� �� ���ܸ� �߻����Ѿ� ��)
** �ɼ�2: ���� ���� �迭�� ������ ��� false �����ϴ� ���, ���� �迭�� 2��� Ȯ���ϵ��� �� �� ��
          (�� ��� ù��° add �޼ҵ��� ���� ���� �׻� true�̴�)
** �ɼ�3: MyArrayList Ŭ������ ������ �̿ܿ��� �پ��� �ڷ����� ��ü ���Ҹ� �ٷ� �� �ֵ��� ���׸� Ŭ������ �ۼ��� �� ��
** �ɼ�4: toString() ���� String ��� StringBuffer�� �̿��Ͽ� ������ �� ��
----------------------------------------------------------
����
- �����ڷᱸ�� ���� ������ �����Ѵ�.

----------------------------------------------------------
���ǻ���
- ������ comment
//***************************
// ���ϸ�: ... .java
// �ۼ���: ...
// �ۼ���: ...
// ����:...
//***************************

- �鿩����
- �ĺ��� �̸��� �ڹ� ���ʿ� �°� ������ ���� ��
- command-line���� java -jar �����ڵ�.jar �� ä���մϴ�. ö�ڵ� �Ȱ��� �� ����� ����� ����Ǿ�� �մϴ�.
- �����ڵ�� ������ �̸��� �� ó�� ���

----------------------------------------------------------
���� 
- �����ڵ�.jar ����
- .java ����
*/