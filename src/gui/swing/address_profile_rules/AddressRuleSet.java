package gui.swing.address_profile_rules;
import java.lang.String;

import java.awt.Component;

final public class AddressRuleSet implements RuleSet {
	//package level access
	AddressRuleSet() {}
	@Override
	public void applyRules(Component ob) throws RuleException {
		AddressWindow addr = (AddressWindow)ob;
		
		
		//A. All fields must be nonempty
		if(addr.getIdValue().length()==0)
		{
		
			throw new RuleException("ID could not be empty!");
			
		}
		
		//B. ID field must be numeric
		else if(!isNumber(addr.getIdValue()))
		{
			throw new RuleException("ID field must be numeric!");
			
		}
		 if(addr.getStreetValue().length()==0)
		{
			
			throw new RuleException("Street could not be empty!");
			
		}
		else if(addr.getCityValue().length()==0)
		{
			
			throw new RuleException("City could not be empty!");
			
		}else if(addr.getStateValue().length()==0)
		{
			
			throw new RuleException("State could not be empty!");
			
		}
		
		//D. State must have exactly two characters in the range A-Z
						

			String temp=addr.getStateValue();
			if(temp.length()!=2|| 
				temp.length()==2&&temp.charAt(0)>'Z'&&temp.charAt(0)<'A'
				&&temp.charAt(1)>'Z'&&temp.charAt(1)<'A')			
			{		
	
				throw new RuleException("State must have exactly two characters in the range A-Z!");
		
			}
			
			
		 if(addr.getZipValue().length()==0)
		{
			
			throw new RuleException("Zip could not be empty!");
			
		}
			
		//C. Zip must be numeric with exactly 5 digits
				
		else if(!  ( isNumber(addr.getZipValue())&& addr.getZipValue().length()==5  ))
				
		{ 
					
			throw new RuleException("Zip must be numeric with exactly 5 digits!");
						
		}
		//E. ID field may not equal zip field.
		else if(addr.getIdValue().equals(addr.getZipValue()))
				
			{ 
						
				throw new RuleException(" ID field may not equal zip field.!");
							
			}
	}

	
	public static boolean isNumber(String toTest) {
	    boolean isNegativeFoundAlready = false;
	    boolean isDecimalPointFoundAlready = false;
	    for (int i=0; i < toTest.length(); i++) {
	        if (!"0123456789-.".contains(new String(new char[]{toTest.charAt(i)}))) {
	            return false;
	        } else {
	            if ('-' == toTest.charAt(i) && i != 0) {
	                return false;
	            }
	            if ('-' == toTest.charAt(i) && (i == toTest.length() - 1)) {
	                return false;
	            }

	            if ('-' == toTest.charAt(i) && isNegativeFoundAlready) {
	                return false;
	            }
	            if ('-' == toTest.charAt(i)) {
	                isNegativeFoundAlready = true;
	            }
	            if ('.' == toTest.charAt(i) && isDecimalPointFoundAlready) {
	                return false;
	            }
	            if ('.' == toTest.charAt(i)) {
	                isDecimalPointFoundAlready = true;
	            }
	            if ('.' == toTest.charAt(i) && (i == toTest.length() - 1)) {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	
}
