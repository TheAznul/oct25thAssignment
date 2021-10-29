package octWeekof25th;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14, 12, 70, 15, 99, 65, 21, 90};
		int start = 0;
		int end = 0;
		int sum = 0;
		int X = 97;
		outerloop:
		for(int c = 0; c < arr.length; c++) {
			sum = 0;
			start = 0;
			for(int i=c; i < arr.length; i++) {
				start = c;
				sum += arr[i];
				
				if(sum > X) {
					break;
				}
				else if(sum == X) {
					end = i;
					break outerloop;
				}
				
				
			}
			
		}
		System.out.println("Start: " + start + " End: " + end);
		

	}

}
