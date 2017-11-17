package functional_programming_stream;
import java.math.BigInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BigIntegerPrime {
	

	public static void main(String[] args) {
	      PrimeStream ps = new PrimeStream(); //PrimeStream is   enclosing class
	       ps.printFirstNPrimes(10);
	       System.out.println("====");
	       ps.printFirstNPrimes(5);
	}
	
	public static class PrimeStream
	{
	
		void printFirstNPrimes(int num)
		{
			//Stream <Integer> stream=Stream.iterate(1, n->n+1);
			final Stream<BigInteger> stream1=Stream.iterate(new BigInteger("1") , n->n.add(new BigInteger("1"))).filter(isPrime).limit(num);
			System.out.println(stream1.collect(Collectors.toList()));
			
		}
	}
	
	public static boolean isBigPrime(BigInteger n) {
	    if (n.compareTo(new BigInteger("2")) < 0) return false;
	    else if (n.compareTo(new BigInteger("2")) == 0) return true;
	    else if (n.compareTo(new BigInteger("4")) == 0) return false;
	    for (BigInteger i = new BigInteger("2"); i.compareTo(n.divide(new BigInteger("2"))) < 0; i = i.add(BigInteger.ONE))
	        if (n.mod(i).equals(BigInteger.ZERO))
	            return false;
	    return true;
	}
	
	static Predicate <BigInteger> isPrime=BigIntegerPrime::isBigPrime;
}
/*
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
====
[2, 3, 5, 7, 11]
*/
