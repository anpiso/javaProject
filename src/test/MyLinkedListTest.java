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
		System.out.println("hw6_1 : 용동중");
		MyLinkedList list = new MyLinkedList();

		Scanner input = new Scanner(System.in);

		// (2) 사용자에게 메뉴를 반복 제공하고 7을 입력하면 반복 종료
		int menu = 0;
		int element = 0;
		do {
			System.out.print(" 1:전체조회 2:길이조회 3:맨 앞 삽입 4:맨 뒤 삽입 5:맨 앞 원소 삭제 6:맨 뒤 삭제 7:종료 ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("리스트 전체를 조회합니다.");
				System.out.println(list.toString());   // 완성하세요.
				break;
			case 2:
				System.out.println("리스트 길이를 조회합니다.");
				int size = list.size();  // 완성하세요.
				System.out.println(size);
				break;
			case 3:
				System.out.println("원소를 리스트의 맨 앞에 삽입합니다.");
				System.out.print("정수값 입력 :");
				element = input.nextInt();
				list.addFirst(element);
				break;
			case 4:
				System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				list.addLast(element);;  // 완성하세요.
				break;

			case 5:
				System.out.println("맨 앞 원소 삭제.");
				list.removeFirst();
				break;

			case 6:
				System.out.println("맨 뒤 원소 삭제");
				list.removeLast();
				break;

			case 7:
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 7);
	}

}

/*
다음과 같이 내부적으로 단순 연결리스트를 사용하여 정수 리스트를 관리하는 MyLinkedList 클래스를 작성하고 사용하는 프로그램을 작성하시오.
예외 상황은 처리하지 않아도 됨

- MyLinkedList 클래스

  클래스:
        단순 연결리스트의 노드를 표현하는 노드 클래스

  필드(private 인스턴스 변수):
        리스트의 첫번째 노드를 가리킬 변수(head) - null로 초기화 됨
 ** 연결리스트 연습을 위해 리스트의 원소 수를 나타내는 변수는 두지 말 것

  메소드(public 메소드):
        맨앞 삽입 메소드(addFirst) - 정수값을 매개변수로 받아 리스트의 맨 앞에 삽입
        toString 오버라이드 - 리스트에 저장된 항목 전체를 문자열로 리턴

 ****** lab6_1 에 다음 메소드들을 추가
        size - 리스트의 길이를 리턴
        addLast - 정수값을 매개변수로 받아 리스트의 마지막에 삽입     
        removeFirst - 리스트의 가장 앞 원소(정수값)을 삭제하여 리턴  
        removeLast - 리스트의 마지막 원소(정수값)을 삭제하여 리턴  

 ** 위의 메소드들에는 출력문 없음

- 드라이버 클래스(예를 들어 MyLinkedListTest 클래스)의 main 메소드는 다음을 수행

(1) MyLinkedList 객체를 생성(list라고 하자)
(2) 사용자에게 다음과 같은 메뉴를 반복하여 제공하되 7 입력시 반복 종료
   1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:종료

1 선택시, list의 전체 내용을 출력(toString 호출)
2 선택시, list의 길이를 출력(size 호출)
3 선택시, 사용자로부터 정수값을 입력받아 list 맨 앞에 삽입
4 선택시, 사용자로부터 정수값을 입력받아 list 맨 뒤에 삽입
5 선택시, list 맨 앞에서 정수값을 삭제하고 그 정수를 출력
6 선택시, list 맨 뒤에서 정수값을 삭제하고 그 정수를 출력
 */