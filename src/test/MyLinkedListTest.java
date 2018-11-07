package test;
import java.util.*;

class MyLinkedList{

	private static int sizeNum;
	private Node head = null;

	private class Node{
		int data;
		Node link;

		Node(int data){
			this.data = data;
			sizeNum++;
		}
	}

	public void addFirst(int a) {
		Node list = new Node(a);
		list.link = head;
		head = list;		
	}

	public int size() {
		return sizeNum;
	}

	public void addLast(int a) {

		if(head == null) {
			Node list = new Node(a);
			list.link = head ;
			head =list ;			
		}		
		else {
			Node list = new Node(a);
			Node temp = head;		
			while(temp.link != null) 			
				temp = temp.link;				
			temp.link = list;	

		}
	}

	public void removeFirst() {
		head = head.link;
		sizeNum--;
	}

	public void removeLast() {
		Node temp = head;
		while(temp.link != null) {
			temp = temp.link;
			temp.link = null;
		}
		sizeNum--;
	}

	@Override
	public String toString() {
		String arr = "";
		Node a = head;
		while(a != null) {
			arr += a.data + " ";	
			a = a.link;			
		}
		return "MyLinkedList [" + arr + "]";
	}	


}

public class MyLinkedListTest {

	public static void main(String[] args) {
		System.out.println("hw6_1 : �뵿��");
		MyLinkedList list = new MyLinkedList();

		Scanner input = new Scanner(System.in);

		// (2) ����ڿ��� �޴��� �ݺ� �����ϰ� 7�� �Է��ϸ� �ݺ� ����
		int menu = 0;
		int element = 0;
		do {
			System.out.print(" 1:��ü��ȸ 2:������ȸ 3:�� �� ���� 4:�� �� ���� 5:�� �� ���� ���� 6:�� �� ���� 7:���� ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("����Ʈ ��ü�� ��ȸ�մϴ�.");
				System.out.println(list.toString());   // �ϼ��ϼ���.
				break;
			case 2:
				System.out.println("����Ʈ ���̸� ��ȸ�մϴ�.");
				int size = list.size();  // �ϼ��ϼ���.
				System.out.println(size);
				break;
			case 3:
				System.out.println("���Ҹ� ����Ʈ�� �� �տ� �����մϴ�.");
				System.out.print("������ �Է� :");
				element = input.nextInt();
				list.addFirst(element);
				break;
			case 4:
				System.out.println("���Ҹ� ����Ʈ�� �� �ڿ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				list.addLast(element);;  // �ϼ��ϼ���.
				break;

			case 5:
				System.out.println("�� �� ���� ����.");
				list.removeFirst();
				break;

			case 6:
				System.out.println("�� �� ���� ����");
				list.removeLast();
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
������ ���� ���������� �ܼ� ���Ḯ��Ʈ�� ����Ͽ� ���� ����Ʈ�� �����ϴ� MyLinkedList Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ��Ȳ�� ó������ �ʾƵ� ��

- MyLinkedList Ŭ����

  Ŭ����:
        �ܼ� ���Ḯ��Ʈ�� ��带 ǥ���ϴ� ��� Ŭ����

  �ʵ�(private �ν��Ͻ� ����):
        ����Ʈ�� ù��° ��带 ����ų ����(head) - null�� �ʱ�ȭ ��
 ** ���Ḯ��Ʈ ������ ���� ����Ʈ�� ���� ���� ��Ÿ���� ������ ���� �� ��

  �޼ҵ�(public �޼ҵ�):
        �Ǿ� ���� �޼ҵ�(addFirst) - �������� �Ű������� �޾� ����Ʈ�� �� �տ� ����
        toString �������̵� - ����Ʈ�� ����� �׸� ��ü�� ���ڿ��� ����

 ****** lab6_1 �� ���� �޼ҵ���� �߰�
        size - ����Ʈ�� ���̸� ����
        addLast - �������� �Ű������� �޾� ����Ʈ�� �������� ����     
        removeFirst - ����Ʈ�� ���� �� ����(������)�� �����Ͽ� ����  
        removeLast - ����Ʈ�� ������ ����(������)�� �����Ͽ� ����  

 ** ���� �޼ҵ�鿡�� ��¹� ����

- ����̹� Ŭ����(���� ��� MyLinkedListTest Ŭ����)�� main �޼ҵ�� ������ ����

(1) MyLinkedList ��ü�� ����(list��� ����)
(2) ����ڿ��� ������ ���� �޴��� �ݺ��Ͽ� �����ϵ� 7 �Է½� �ݺ� ����
   1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:����

1 ���ý�, list�� ��ü ������ ���(toString ȣ��)
2 ���ý�, list�� ���̸� ���(size ȣ��)
3 ���ý�, ����ڷκ��� �������� �Է¹޾� list �� �տ� ����
4 ���ý�, ����ڷκ��� �������� �Է¹޾� list �� �ڿ� ����
5 ���ý�, list �� �տ��� �������� �����ϰ� �� ������ ���
6 ���ý�, list �� �ڿ��� �������� �����ϰ� �� ������ ���
 */