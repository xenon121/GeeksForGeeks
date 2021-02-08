package gfg.competetion30days;

import java.util.Arrays;

public class SmallestPositiveIntegerNotRepresentedAsSum_day3 {

	public static void main(String[] args) {

		int[] numbers = { 1,2,2,3,5};
		//int[] numbers = { 1,1,1,1,1};
		//int[] numbers = { 1,10,3,11,6,15};
		
		int smallPossibleNumber = 1;
		boolean isSmallestPossibleNumber = false;
		int maxL = numbers.length;

		Arrays.sort(numbers);
		
		for(int p = 0; p<maxL; p++) {
			System.out.println(numbers[p]);
		}
		
		for (int i = 0; i < maxL; i++) {

			if (numbers[i] == (i+1 < maxL ? numbers[i + 1] : numbers[i]) 
					|| numbers[i] == smallPossibleNumber 
					|| numbers[i] + 1 == (i+1 < maxL ? numbers[i + 1] : numbers[i])) {
				
				++smallPossibleNumber;

			} /*else {

				while (smallPossibleNumber < (i+1 < maxL ? numbers[i + 1] : numbers[i])) {

					isSmallestPossibleNumber = true;

					for (int j = 0; j < (i + 1); j++) {

						for (int k = j + 1; k < (i + 1); k++) {
							
							for(int l = k + 1; l < (i + 1); l++) {
								
								if (numbers[j] + numbers[k] == smallPossibleNumber 
										|| numbers[j] + numbers[l] == smallPossibleNumber
										|| numbers[k] + numbers[l] == smallPossibleNumber
										|| numbers[j] + numbers[k] + numbers[l] == smallPossibleNumber) {
									
									j = k = l = (i+1);
									++smallPossibleNumber;
									isSmallestPossibleNumber = false;
								}
							}
						}
					}
					
					if (isSmallestPossibleNumber) break;
				}

				if (isSmallestPossibleNumber) break;
			}*/
		}
		
		/*if(!isSmallestPossibleNumber) {
			
			if(smallPossibleNumber < numbers[numbers.length-1]) {
				smallPossibleNumber = numbers[numbers.length-1];
			}
			
			while(!isSmallestPossibleNumber) {
				
				isSmallestPossibleNumber = true;
				
				for (int j = 0; j < numbers.length; j++) {

					for (int k = j + 1; k < numbers.length; k++) {
						
						for(int l = k + 1; l < numbers.length; l++) {

							if (numbers[j] == smallPossibleNumber 
								|| numbers[k] == smallPossibleNumber 
								|| numbers[l] == smallPossibleNumber 
								|| numbers[j] + numbers[k] == smallPossibleNumber 
								|| numbers[j] + numbers[l] == smallPossibleNumber
								|| numbers[k] + numbers[l] == smallPossibleNumber
								|| numbers[j] + numbers[k] + numbers[l] == smallPossibleNumber) {	
								
								++smallPossibleNumber;
								isSmallestPossibleNumber = false;
							}
						}
					}
				}
				
			}
		}*/
		if(!isSmallestPossibleNumber) {
			
			if(smallPossibleNumber < numbers[numbers.length-1]) {
				smallPossibleNumber = numbers[numbers.length-1];
			}
		
		while(!isSmallestPossibleNumber) {
			
			isSmallestPossibleNumber = true;
			
			for (int j = 0; j < numbers.length; j++) {
				
				for (int k = j + 1; k < numbers.length; k++) {
					
					for(int l = k + 1; l < numbers.length; l++) {
						
						System.out.println("............smallPossibleNumber: "+smallPossibleNumber);
						System.out.println("numbers["+j+"] + numbers["+k+"]: "+(numbers[j] + numbers[k]));
						System.out.println("numbers["+j+"] + numbers["+l+"]: "+(numbers[j] + numbers[l]));
						System.out.println("numbers["+k+"] + numbers["+l+"]: "+(numbers[k] + numbers[l]));
						System.out.println("numbers["+j+"] + numbers["+k+"] + numbers["+l+"]: "+(numbers[j] + numbers[k] + numbers[l]));
						
						if (numbers[j] == smallPossibleNumber 
								|| numbers[k] == smallPossibleNumber 
								|| numbers[l] == smallPossibleNumber 
								|| numbers[j] + numbers[k] == smallPossibleNumber 
								|| numbers[j] + numbers[l] == smallPossibleNumber
								|| numbers[k] + numbers[l] == smallPossibleNumber
								|| numbers[j] + numbers[k] + numbers[l] == smallPossibleNumber) {
							
							++smallPossibleNumber;
							isSmallestPossibleNumber = false;
						}
					}
				}
			}
			
		}
		}
		System.out.println("smallPossibleNumber: "+smallPossibleNumber);
		
	}

}
