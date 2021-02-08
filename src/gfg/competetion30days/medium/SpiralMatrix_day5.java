package gfg.competetion30days.medium;

public class SpiralMatrix_day5 {

	public static void main(String[] args) {
		
		int N = 3, M = 3, K = 4;
		int A[][] = {{1, 2, 3}, 
				     {4, 5, 6}, 
				     {7, 8, 9}};
		
		// Nt = N Tracker, Mt = M Tracker
		int Nt=1, Mt=A.length-1;
		
		boolean isIncreamentN = true, isOperateN = true;
		boolean isIncreamentM = false;
		
		int Nlimit = A.length-1, Nstart = 1;
		int Mlimit = A.length-2, Mstart = 0;
		
		for(int i=1; i<A.length; i++) {
			
			for(int j=0; j<A.length; j++) {
				
				//A[i][j] = 
				
				if(isOperateN) {
					
					if(isIncreamentN) {
						Nt++;						
					}else {
						Nt--;
					}
					
					if(Nt == Nlimit) {
						Nlimit--;
						isIncreamentN = !isIncreamentN;
						isOperateN = false;
						
					}else if(Nt == Nstart) {
						Nstart++;
						isIncreamentN = !isIncreamentN;
						isOperateN = false;
					}
					
				}else {
					
					if(isIncreamentM) {
						Mt++;
					}else {
						Mt--;
					}
					
					if(Mt == Mlimit) {
						Mlimit--;
						isIncreamentM = !isIncreamentM;
						isOperateN = true;
						
					}else if(Mt == Mstart) {
						Mlimit++;
						isIncreamentM = !isIncreamentM;
						isOperateN = true;
					}
				}	
			}
		}
	}

}
