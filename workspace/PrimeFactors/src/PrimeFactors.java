import java.util.ArrayList;
import java.util.List;


public class PrimeFactors {

	public static List<Integer> Create(Integer n) {
		List<Integer> primes = new ArrayList<Integer>();
		int cadidate = 2;
		while(n > 1){
			for(;n % cadidate == 0;n /= cadidate){
				primes.add(cadidate);
			}
			cadidate++;
		}
		return primes;
	}
}
