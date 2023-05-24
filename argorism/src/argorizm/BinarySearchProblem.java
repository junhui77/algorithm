package argorizm;

import java.util.Arrays;

public class BinarySearchProblem {
	public static void main(String[] args) {
		int[] numbers = {12, 25, 33, 50, 10, 60, 80, 11, 32, 101};
		
		
		Arrays.sort(numbers); // 배열을 오름차순으로 정렬
		
		int target = 101;
		int left = 0;
		int right = numbers.length-1;
		int mid = (left + right)/2;
		
		int temp = numbers[mid];
		boolean find = false;
		
		while(left <= right) {
			if(target == temp) {
				find = true;
				break;
				
			}else if(target < temp) {
				right = mid - 1;
				
			}else{
				left = mid + 1;
			}
			mid = (left + right)/2;
			temp = numbers[mid];
			
		}
		if(find == true) {
			mid++;
			System.out.println("찾는 수는 " + mid + "번째 순서 입니다.");
		}else System.out.println("찾는 수 가 없습니다.");
	}
	
}
