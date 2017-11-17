package functional_programming_stream.lab9_7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

	 
	 public static final TriFunction <List<Employee>, Integer ,Character, List<String>>  QUALIFIED = (list,i,c)->
	 list.stream().
		filter(x->x.getSalary()>i).
		filter(x->x.getLastName().charAt(0)>=c).
		map(x->x.getFirstName()+" "+x.getLastName()).
		sorted().collect(Collectors.toList());
}
