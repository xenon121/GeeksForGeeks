package gfg.competetion30days;

public class NthNaturalNumber_day2 {

	public static void main(String[] args) {

		long N = 100;

		long ans = 0;
		long ans1 = 1;
		while (N != 0) {
			long digit = N % 9;
			N = N / 9;
			ans += (ans1 * digit);
			ans1 = ans1 * 10;
		}
		System.out.println(ans);

	}

}
