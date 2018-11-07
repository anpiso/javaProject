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
		System.out.println("course4 : 용동중 ");

		// 선형 리스트 list = (22, 33, 44, 55, 66) 를 단순 연결 리스트로 표현
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

		// 리스트를 출력
		System.out.println("초기 상태:");
		printList(list);

		// (1) 리스트의 첫번째 원소를 삭제
		list = list.link;




		// 리스트를 출력
		System.out.println("첫번째 원소 삭제 후:");
		printList(list);

		// (2) 리스트의 맨 앞에 11을 삽입
		Node temp = new Node(11);
		temp.link = list;
		list = temp;




		// 리스트를 출력
		System.out.println("맨 앞에 11 삽입 후:");
		printList(list);

		// (3) 리스트의 마지막 원소 값을 1 증가(+1)
			Node head = list;
			while(head.link != null) {
				head = head.link;
			}
			head.data++;
			
		




		// 리스트를 출력
		System.out.println("마지막 원소값 1 증가 후:");
		printList(list);

		// (4) 리스트의 두번째 원소를 삭제

		list.link = list.link.link;




		// 리스트를 출력
		System.out.println("두번째 원소 삭제 후:");
		printList(list);
	}

	// list가 가리키는 단순 연결 리스트의 원소들을 모두 출력하는 메소드
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
단순 연결 리스트로 구현한 정수 리스트를 다루는 프로그램이다.
주석을 참고하여 첨부한 코드의 (1) ~ (4) 부분을 완성하시오.

- 실행 예
course4 : 홍길동

초기 상태:
22 33 44 55 66
첫번째 원소 삭제 후:
33 44 55 66
맨 앞에 11 삽입 후:
11 33 44 55 66
마지막 원소 1 증가 후:
11 33 44 55 67
두번째 원소 삭제 후:
11 44 55 67

----------------------------------------------------------
목적
- 단순 연결 리스트의 연산을 연습한다.

----------------------------------------------------------
유의사항
- 들여쓰기
- 식별자 이름을 자바 관례에 맞게 적절히 붙일 것
- command-line에서
  > java -jar course1.jar
  로 채점합니다. 철자도 똑같게 이 명령이 제대로 실행되어야 합니다.
- 과제코드와 본인의 이름을 맨 처음 출력

----------------------------------------------------------
제출 
- 실행파일: 과제코드.jar 파일
- 소스코드파일: .java 파일


 */