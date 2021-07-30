package 알고리즘;

public class ex01 {
	
	public static void main(String args[]) {

		//배열 안의 최솟값, 최대값 구하기 (for문은 한번만 돌아야함)
		
		int [] numbers = {51, 10, 23, 24, 51, 59, 80, 82, 47, 95};
		
		int min = numbers[0];
		int max = numbers[0];
		int minPos = 0;
		int maxPos = 0;
		
		for(int i=1; i<numbers.length; i++) {
			
			if(min>numbers[i]) {
				min = numbers[i];
				minPos = i+1;
			}
			if(max<numbers[i]) {
				max = numbers[i];
				maxPos = i+1;						
			}
		}
		
		System.out.printf("최소 값은 %d 이며 위치는 %d 번재 입니다.%n",min, minPos);
		System.out.printf("최대 값은 %d 이며 위치는 %d 번재 입니다.",max, maxPos);
		
		System.out.println(numbers.length);
		
		
		
		
		
		
	}
}
