package functional_programming_stream.prob2;

import java.util.Arrays;
import java.util.List;


public class TraderTransactTestData {
	 
        static Trader raoul = new Trader("Raoul", "Cambridge");
        static Trader mario = new Trader("Mario","Milan");
        static Trader alan = new Trader("Alan","Cambridge");
        static Trader brian = new Trader("Brian","Cambridge");
		
		static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
		
		public static List<Transaction> getTransactions() {
			return transactions;
		}
        
		
		   
	
			//Find all transactions from year 2011 and sort them by value (small to high).
			
//		List<Transaction> testItem3 = TraderTransactTestData.getTransactions();
//			System.out.println(LambdaLibrary.IMPLEMENT);
		   
			 
	

        
        
}
