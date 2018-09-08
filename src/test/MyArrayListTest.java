package test;

import java.util.Arrays;

class MyArrayList {
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



}
public class MyArrayListTest {

	public static void main(String[] args) {

		System.out.println("lab1_6 : ¿ëµ¿Áß");

		MyArrayList list = new MyArrayList();

		System.out.println("list = " + list);

		list.add(2);
		System.out.println("list = " + list);

		list.add(-3);
		System.out.println("list = " + list);

		list.add(0);
		System.out.println("list = " + list);

		list.add(1);
		System.out.println("list = " + list);
		
	}
}