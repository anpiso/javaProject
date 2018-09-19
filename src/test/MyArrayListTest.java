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
	
	
	 //****** lab1_6 에 다음 메소드들을 추가
     //get - 인덱스를 매개변수로 받아 배열의 해당 정수값을 리턴    O(1)
	public int get(int index) {
		return arr[index];
	}
     //size - 리스트의 길이를 리턴(배열 크기가 아님)    O(1)
	public int size() {
		return arr.length;
	}
     //add - 인덱스와 정수값을 매개변수로 받아 배열의 해당 위치에 정수값을 삽입     O(n)
	public void add(int index, int a) {
		int swap;
		for (int i = 0; i < arr.length - index; i++) {
			swap = arr[index+1];
			arr[index+1] = arr[index];
			number++;
		}
		arr[index] = a;
	}
     //remove - 인덱스를 매개변수로 받아 배열의 해당 위치 정수값을 삭제하고 그 값을 리턴   O(n)
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
		System.out.println("hw5_1: 용동중");

		Scanner input = new Scanner(System.in);
		
		// (1) Integer를 타입 매개변수로 하여 ArrayList 객체를 생성(list라는 이름의 변수에 저장)
		MyArrayList list = new MyArrayList();
		// 완성하세요.

		// (2) 사용자에게 메뉴를 반복 제공하고 7을 입력하면 반복 종료
		int menu = 0;
		int index = 0;
		int element = 0;
		do {
			System.out.print(" 1:인덱스조회 2:전체조회 3:길이조회 4:삽입 5:인덱스삽입 6:인덱스삭제 7:종료 ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("인덱스 위치의 원소값을 조회합니다.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt();
				element = list.get(index); // 완성하세요.
				System.out.println(element);  
				break;
			case 2:
				System.out.println("리스트 전체를 조회합니다.");
				System.out.println(list.toString());   // 완성하세요.
				break;
			case 3:
				System.out.println("리스트 길이를 조회합니다.");
				int size = list.size();  // 완성하세요.
				System.out.println(size);
				break;
			case 4:
				System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				list.add(element);;  // 완성하세요.
				break;
			case 5:
				System.out.println("인덱스 위치에 원소를 삽입합니다.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt();    
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				list.add(index, element);    // 완성하세요.
				break;
			case 6:
				System.out.println("인덱스 위치의 원소를 삭제합니다.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt(); 
				element = list.remove(index); // 완성하세요.
				System.out.println(element);
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
----------------------------------------------------------
다음과 같이 정수 리스트를 관리하는 MyArrayList 클래스를 작성하고 사용하는 프로그램을 작성하시오.

- MyArrayList 클래스 (lab1_6의 MyArrayList 클래스에 ****** 부분 메소드들을 추가하면 됨)
  필드(private 인스턴스 변수):
        정수 배열
        배열에 저장된 항목수

  메소드(public 메소드):
        매개변수가 없는 constuctor - 정수 배열 필드를 크기가 10인 배열로 초기화하고, 항목수 필드는 0으로 초기화
        원소 삽입 메소드(add) - 정수값을 매개변수로 받아 배열에 삽입
           삽입 순서대로 배열의 앞부분부터 채움 
           삽입에 성공하면 true 리턴
           배열이 가득 차면 삽입하지 않으며, false를 리턴      
        toString 오버라이드 - 배열에 저장된 항목 전체를 문자열로 리턴 

        ****** lab1_6 에 다음 메소드들을 추가
        get - 인덱스를 매개변수로 받아 배열의 해당 정수값을 리턴    O(1)
        size - 리스트의 길이를 리턴(배열 크기가 아님)    O(1)
        add - 인덱스와 정수값을 매개변수로 받아 배열의 해당 위치에 정수값을 삽입     O(n)
        remove - 인덱스를 매개변수로 받아 배열의 해당 위치 정수값을 삭제하고 그 값을 리턴   O(n)

- 드라이버 클래스(예를 들어 MyArrayListTest 클래스)의 main 메소드는 다음을 수행

(1) MyArrayList 객체를 생성(list라고 하자)
(2) 사용자에게 다음과 같은 메뉴를 반복하여 제공하되 7 입력시 반복 종료
   1:인덱스조회 2: 전체조회 3:길이조회 4:삽입 5:인덱스삽입 6:인덱스삭제 7:종료

1 선택시, 사용자로부터 인덱스를 입력받아 list에서 값을 조회하여 출력(get 호출)
2 선택시, list의 전체 내용을 출력(toString 호출)
3 선택시, list의 길이를 출력(size 호출)
4 선택시, 사용자로부터 정수값을 입력받아 list에 삽입(add 호출)
5 선택시, 사용자로부터 인덱스와 정수값을 입력받아 list에 삽입(add 호출) ** 주의: 반드시 인덱스, 정수값 순서로 입력받을 것
6 선택시, 사용자로부터 인덱스를 입력받아 list에서 값을 삭제하여 출력(remove 호출)


** 옵션1: 인덱스가 범위를 벗어났을 때 IndexOutOfBoundsException 예외 발생하도록 해 볼 것
          (배열의 인덱스가 아니라 리스트의 인덱스를 벗어났을 때 예외를 발생시켜야 함)
** 옵션2: 내부 정수 배열이 가득찬 경우 false 리턴하는 대신, 정수 배열을 2배로 확장하도록 해 볼 것
          (이 경우 첫번째 add 메소드의 리턴 값은 항상 true이다)
** 옵션3: MyArrayList 클래스를 정수값 이외에도 다양한 자료형의 객체 원소를 다룰 수 있도록 제네릭 클래스로 작성해 볼 것
** 옵션4: toString() 에서 String 대신 StringBuffer를 이용하여 구현해 볼 것
----------------------------------------------------------
목적
- 순차자료구조 연산 구현을 연습한다.

----------------------------------------------------------
유의사항
- 적절한 comment
//***************************
// 파일명: ... .java
// 작성자: ...
// 작성일: ...
// 설명:...
//***************************

- 들여쓰기
- 식별자 이름을 자바 관례에 맞게 적절히 붙일 것
- command-line에서 java -jar 과제코드.jar 로 채점합니다. 철자도 똑같게 이 명령이 제대로 실행되어야 합니다.
- 과제코드와 본인의 이름을 맨 처음 출력

----------------------------------------------------------
제출 
- 과제코드.jar 파일
- .java 파일
*/