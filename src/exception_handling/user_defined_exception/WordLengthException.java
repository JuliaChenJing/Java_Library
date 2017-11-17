package exception_handling.user_defined_exception;

class WordLengthException {

	
	
	public static String handlingExceptions(String l) {

		try {
			return doNothingIfShort(l);
		} catch (InputTooLongException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("exception message: "+e.getMessage());
			return "ERROR";
		}
	}

	static String doNothingIfShort(String input) throws InputTooLongException {
		if (input.length() > 3)
			throw new WordLengthException().new InputTooLongException();
		else
			return input;
	}

	class InputTooLongException extends Exception {
		private static final long serialVersionUID = 1L;

		public InputTooLongException() {
			super("the word must be length 3 or less");
		}

		public InputTooLongException(String s) {
			super(s);
		}

		public InputTooLongException(Throwable t) {
			super(t);
		}
	}

}