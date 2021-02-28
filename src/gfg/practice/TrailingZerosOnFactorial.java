package gfg.practice;

public class TrailingZerosOnFactorial {

	public static int countZeros(int n) {
		
		int count = 0;
		
		for(int i=5; n/i >= 1; i*=5) {
			count += n/i;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		int n = 100;
		
		System.out.println("total trailing zeros: "+countZeros(n));
	}

}
