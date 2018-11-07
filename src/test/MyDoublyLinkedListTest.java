package test;
class MyDoublyLinkedList { 

	private Node head = null;

	private class Node{
		int data;
		Node leftLink;
		Node rightLink;

		Node(int data){
			this.data = data;
		}
	}

		public void addFirst(int a) {
			Node list = new Node(a);
			if(head == null) {
				head = list;
			}else {
				list.rightLink = head;
				head.leftLink = list;
				head = list;
			}
		}

		@Override
		public String toString() {
			String arr = "";
			Node a = head;
			while(a != null) {
				arr += a.data + " ";	
				a = a.rightLink;			
			}
			return "MyDoublyLinkedList [" + arr + "]";
		}


	

	// ����� ��ũ�� ����� �����Ǿ������� Ȯ���ϱ� ���� ����Ʈ�� �պ��ϸ� ����ϴ� �޼ҵ�
	public void printList() {
		if(head == null) {
			System.out.println("( )( )");
		}
		else {
			System.out.print("( ");
			Node temp = head;
			while(temp.rightLink != null) {
				System.out.print(temp.data + " ");
				temp = temp.rightLink;
			}
			System.out.print(temp.data + " //////   ");
			while(temp.leftLink != null) {
				System.out.print(temp.data + " ");
				temp = temp.leftLink;
			}
			System.out.print(temp.data);
			
			System.out.print(")");
		}
	}
}



public class MyDoublyLinkedListTest {


	public static void main(String[] args) {
		System.out.println("lab6_2 : �뵿��");
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		System.out.println(list.toString());
		
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);	
		
		System.out.println(list.toString());
		list.printList();

	}

}