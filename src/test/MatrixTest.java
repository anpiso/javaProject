package test;
public class MatrixTest {
	public static void main(String[] args) {
		System.out.println("hw5_2: 용동중");

		// 행렬 x, y의 곱을 구하여 출력
		int[][] x = {
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4}
		};

		int[][] y = {
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2}
		};

		int[][] z = MyMatrixService.multiply(x, y);     
		MyMatrixService.print(z);
		System.out.println();

		// 행렬 a, b의 곱을 구하여 출력
		int[][] a = {
				{1, 1, 1},
				{2, 2, 2},
				{1, 2, 3},
				{4, 5, 6}
		};

		int[][] b = {
				{1, 1, 1, 1, -3},
				{1, 2, 3, 4, 5},
				{-2, 0, 6, 9, 12}
		};


		int[][] c = MyMatrixService.multiply(a,  b);     
		MyMatrixService.print(c);
	}
}

class MyMatrixService {
	// (1) 정적 메소드 multiply를 작성하시오.
	// 이차원 정수 배열로 표현된 두개의 행렬을 매개변수로 받아 곱을 구해 결과를 이차원 정수 배열로 표현하여 리턴
	// 매개변수로 받은 두 행렬은 곱을 구하기에 타당한 크기라고 가정해도 됨 
	public static int[][] multiply(int[][] x, int [][] y){
		int z[][] = new int[x.length][y[0].length];
		for (int i = 0; i < x.length; i++) {			
			for (int j = 0; j < y[0].length; j++) {
				for (int k = 0; k < y.length; k++) {
					z[i][j] += x[i][k] * y[k][j];
				}
			}
		}		
		return z;
	}
	// (2) 정적 메소드 print를 작성하시오.
	// 이차원 정수 배열로 표현된 하나의 행렬을 매개변수로 받아 한 줄에 한 행씩 출력	 
	public static void print(int[][] z) {
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[0].length; j++) {
				System.out.print(z[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
/*
---------------------------------------------------------
2차원 정수 배열로 표현된 행렬의 곱을 구하여 출력하는 프로그램을 작성하시오.
첨부한 파일에서 주석을 참고하여 (1), (2) 부분을 완성하시오.

- 실행 예:

hw5_2: 홍길동

48 48 48 48 48 48
48 48 48 48 48 48
48 48 48 48 48 48
48 48 48 48 48 48
48 48 48 48 48 48
48 48 48 48 48 48

0 3 10 14 14 
0 6 20 28 28 
-3 5 25 36 43 
-3 14 55 78 85 

----------------------------------------------------------
 */