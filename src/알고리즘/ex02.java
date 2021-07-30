package 알고리즘;

public class ex02 {

	public static void main(String[] args) {
		
		//배열 안에서의 원하는 숫자 빠르게 찾기
		
		int [] numbers = {10, 23, 30, 37, 41, 45, 57, 78, 90, 104};
		
		int target = 45;
		int left = 0;
		int right = numbers.length-1;       
		int mid = (left+right)/2;
		int temp = numbers[mid];
		
		boolean find = false;
		
		while(left<=right){
			
			if(target==temp) {
				find = true;
				break;
			}
			
			else if(target<temp) { //찾으려는 수가 더 작은경우
				right = mid-1;
								
			}
			else {				
				left = mid +1;
			}		
			mid = (left+right)/2;
			temp = numbers[mid];
		}
		
		if(find==true) {
			mid++;
			System.out.println("찾은 수는 "+mid+"번째 칸에 있습니다");
		}
		else
			System.out.println("찾는수가 없습니다.");
	
		
	}
}


