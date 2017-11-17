package functional_programming_stream;
import java.util.stream.IntStream;

public class RangeDemo {

	public static void main(String[] args) {
		
		IntStream ones = IntStream.generate(() -> 1).limit(10);//.distinct();
		 //ones=IntStream.range(0,10);
		ones.forEach(System.out::println);
		}
}

/*

1
1
1
1
1
1
1
1
1
*/
