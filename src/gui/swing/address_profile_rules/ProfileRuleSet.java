package gui.swing.address_profile_rules;

import java.awt.Component;


final public class ProfileRuleSet implements RuleSet {
	//package level access
	ProfileRuleSet() {}
	@Override
	public void applyRules(Component ob) throws RuleException {
		ProfileWindow custProf = (ProfileWindow)ob;
		//validate data here 
		
		//B. All fields must be nonempty
		
		if(custProf.getIdValue().length()==0)	
		{
						
			throw new RuleException("ID could not be empty!");			
				
		}
		if(custProf.getFirstNameValue().length()==0)
			
		{
						
			throw new RuleException("First name could not be empty!");			
				
		}
		if(custProf.getLastNameValue().length()==0)
			
		{
						
			throw new RuleException("Last name could not be empty!");			
				
		}
		if(custProf.getFavoriteMovieValue().length()==0)
		{
						
			throw new RuleException("Favorate movie could not be empty!");			
				
		}
		if(custProf.getFavoriteRestaurantValue().length()==0)
			
		{
						
			throw new RuleException("Favorate restaurant could not be empty!");			
				
		}

		//A. Favorite restaurant cannot equal favorite movie
		if(custProf.getFavoriteRestaurantValue().equals(custProf.getFavoriteMovieValue()))
			
		{
						
			throw new RuleException("Favorite restaurant cannot equal favorite movie!");			
				
		}
	
		//C. ID must be numeric
		if(!AddressRuleSet.isNumber(custProf.getIdValue()))
			
		{
						
			throw new RuleException("ID must be numeric!");			
				
		}
		//D. firstname and lastname fields may not contain spaces or characters other than a-z, A-Z.	

		if( !    isName(custProf.getFirstNameValue()))
			
		{
						
			throw new RuleException("firstname  field may not contain spaces or characters other than a-z, A-Z	!");			
				
		}
		
		if(!isName(custProf.getLastNameValue()))
						
		{
											
			throw new RuleException("lastname field may not contain spaces or characters other than a-z, A-Z	!");							
				
		}
	
	}
	public static boolean isName(String s) {
	    boolean re=true;
	    char t;
	    for(int i=0;i<s.length();i++)
	    {
	    	t=s.charAt(i);
	    	if( !    (      (t<='z')&&(t>='a')   )||  (  (t<='Z')&&(t>='A')  )  )
	    		re=false;
	    }
	    return re;
	}

}
