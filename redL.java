
public class redL {
	
	public static int[] solution (int [] lottos, int [] win_nums) {
		
		int grade = 0;
		int zero = 0;
		int high;

		for (int i = 0; i < 6; i++) {
			if (lottos[i] == 0) {
				zero++;
		}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lottos[i] == win_nums[j]) {
					grade++;
				}
			}
		}

		
		high = grade+zero;
		
		
		
		switch (grade) {
		case 0:
		case 1:
			grade = 6;
			break;
		case 2:
			grade = 5;
			break;
		case 3:
			grade = 4;
			break;
		case 4:
			grade = 3;
			break;
		case 5:
			grade = 2;
			break;
		case 6:
			grade = 1; 
			break;
		}
		
		switch(high) {
		case 2:
			high = 5;
			break;
		case 3:
			high = 4;
			break;
		case 4:
			high = 3;
			break;
		case 5:
			high = 2;
			break;
		case 6:
			high = 1; 
			break;
		}
		
		
		 int[] answer = {high, grade};
		 
		 
	     return answer;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_num = {20, 9, 3, 45, 4, 35};
		
		int[] result = redL.solution(lottos, win_num);
		
		
		
	}

}
