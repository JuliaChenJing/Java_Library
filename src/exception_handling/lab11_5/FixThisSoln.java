package exception_handling.lab11_5;

class FixThisSoln {

	 
	public static  String handlingExceptions(String l) {
		
		try {
			return doNothingIfShort(l);
		} catch (InputTooLongException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getMessage();
		}
}


	static  String doNothingIfShort(String input) throws InputTooLongException {
		    if (input.length() > 3) 
		    	throw new FixThisSoln().new InputTooLongException();
		    else
		    	return input;
		}

	
	class InputTooLongException extends Exception {
		private static final long serialVersionUID = 1L;
		public InputTooLongException() {
			super("Must be length 3 or less");
		}
		public InputTooLongException(String s) {
			super(s);
		}
		public InputTooLongException(Throwable t) {
			super(t);
		}
	}
}