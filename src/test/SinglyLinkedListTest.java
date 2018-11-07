package test;

class Node {
	int data;
	Node link;
	Node(int data) {
		this.data = data;
		this.link = null;
	}
}

public class SinglyLinkedListTest {
	public static void main(String[] args) {
		System.out.println("course4 : �뵿�� ");

		// ���� ����Ʈ list = (22, 33, 44, 55, 66) �� �ܼ� ���� ����Ʈ�� ǥ��
		Node n1 = new Node(22);
		Node n2 = new Node(33);
		Node n3 = new Node(44);
		Node n4 = new Node(55);
		Node n5 = new Node(66);
		n1.link = n2;
		n2.link = n3;
		n3.link = n4;
		n4.link = n5; 
		Node list = n1;
		n1 = n2 = n3 = n4 = n5 = null;

		// ����Ʈ�� ���
		System.out.println("�ʱ� ����:");
		printList(list);

		// (1) ����Ʈ�� ù��° ���Ҹ� ����
		list = list.link;




		// ����Ʈ�� ���
		System.out.println("ù��° ���� ���� ��:");
		printList(list);

		// (2) ����Ʈ�� �� �տ� 11�� ����
		Node temp = new Node(11);
		temp.link = list;
		list = temp;




		// ����Ʈ�� ���
		System.out.println("�� �տ� 11 ���� ��:");
		printList(list);

		// (3) ����Ʈ�� ������ ���� ���� 1 ����(+1)
			Node head = list;
			while(head.link != null) {
				head = head.link;
			}
			head.data++;
			
		




		// ����Ʈ�� ���
		System.out.println("������ ���Ұ� 1 ���� ��:");
		printList(list);

		// (4) ����Ʈ�� �ι�° ���Ҹ� ����

		list.link = list.link.link;




		// ����Ʈ�� ���
		System.out.println("�ι�° ���� ���� ��:");
		printList(list);
	}

	// list�� ����Ű�� �ܼ� ���� ����Ʈ�� ���ҵ��� ��� ����ϴ� �޼ҵ�
	private static void printList(Node list) {
		Node temp = list;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.link;
		}
		System.out.println();
	}
}

/*
----------------------------------------------------------
�ܼ� ���� ����Ʈ�� ������ ���� ����Ʈ�� �ٷ�� ���α׷��̴�.
�ּ��� �����Ͽ� ÷���� �ڵ��� (1) ~ (4) �κ��� �ϼ��Ͻÿ�.

- ���� ��
course4 : ȫ�浿

�ʱ� ����:
22 33 44 55 66
ù��° ���� ���� ��:
33 44 55 66
�� �տ� 11 ���� ��:
11 33 44 55 66
������ ���� 1 ���� ��:
11 33 44 55 67
�ι�° ���� ���� ��:
11 44 55 67

----------------------------------------------------------
����
- �ܼ� ���� ����Ʈ�� ������ �����Ѵ�.

----------------------------------------------------------
���ǻ���
- �鿩����
- �ĺ��� �̸��� �ڹ� ���ʿ� �°� ������ ���� ��
- command-line����
  > java -jar course1.jar
  �� ä���մϴ�. ö�ڵ� �Ȱ��� �� ����� ����� ����Ǿ�� �մϴ�.
- �����ڵ�� ������ �̸��� �� ó�� ���

----------------------------------------------------------
���� 
- ��������: �����ڵ�.jar ����
- �ҽ��ڵ�����: .java ����


 */