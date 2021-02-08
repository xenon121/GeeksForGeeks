package gfg.competetion30days.medium;

// https://practice.geeksforgeeks.org/problems/257a9e27fb3e58255622c8dcb06e0919cc1c6c11/1/?track=30-DOC-day-6&batchId=320
public class CoinsOfGeekland {

	public static void main(String[] args) {
		
		//int N = 5, K = 1; 
		/*int[][] mat = {{1, 1, 1, 1, 1}, 
				      {2, 2, 2, 2, 2}, 
				      {3, 8, 6, 7, 3}, 
				      {4, 4, 4, 4, 4}, 
				      {5, 5, 5, 5, 5}};
		*/
		
		int N = 1, K = 1;
		int[][] mat = {{4}}; 
	
		if (N == 1) System.out.println("found in 0 place: "+mat[0][0]);
		
		int max = 0, totalMax = 0;
		
		for(int l=0; l<=(N-K); l++) {
		
			for(int m=0; m<=(N-K); m++) {
				
				max = 0;
				for(int i=l; i<(K+l); i++) {
					
					for(int j=m; j<(K+m); j++) {
						max = max + mat[i][j];
						System.out.println("mat["+i+"]["+j+"]: "+max);
					}
				}
				
				if(totalMax < max) {
					totalMax = max;
				}
				
				System.out.println("........totalMax: "+totalMax);
			}
		}
		
		System.out.println("totalMax found: "+totalMax);
	}

}
