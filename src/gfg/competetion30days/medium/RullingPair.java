package gfg.competetion30days.medium;

public class RullingPair {

	static int getDigitSum(int digit) {

		int temp = 0;

		while (digit > 0) {

			temp = temp + (digit % 10);
			digit = digit / 10;
		}

		return temp;
	}

	public static void main(String[] args) {

		//int[] arr = { 55, 23, 32, 46, 88 };
		
		int[] arr = {18, 63};
		int N = arr.length;
		int sumI = 0, sum = -1;

		for (int i = 0; i < N - 1; i++) {
			sumI = getDigitSum(arr[i]);
			
			for (int j = i + 1; j < N; j++) {
				
				if(sumI == getDigitSum(arr[j])) {				
					if(sum < (arr[i] + arr[j])) sum = arr[i] + arr[j];
				}
			}
		}

		System.out.println("maximum sum: "+sum);
	}
}
