#최빈수 구하기 예제
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] inputNum = new int[10];
		for (int i=0; i<10; i++) {
			inputNum[i] = sc.nextInt();
		}
		
		int[] mode = new int[10];
		
		for (int i=0; i<10; i++) {
			mode[inputNum[i]]++;
		}
		int modeNum = 0;
		int modeCnt = 0;
		
		for (int i=0; i<10; i++) {
			if (modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		// 1 2 2 3 1 4 2 2 4 3
		System.out.println("최빈수는:" + modeNum + " cnt:" + modeCnt); 
	}
	

}
