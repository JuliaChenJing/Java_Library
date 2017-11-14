package javaFX.myTable;
public class MyTable {
	Entry[] entries=new Entry[26];
	public MyTable()
	{
		for(int i=0;i<26;i++)
		{
			entries[i]=new Entry(null, (char)('a'+i));
			//entries[i]=new Entry("", (char)('a'+i));
		} 
		
	}
	// returns the String that is matched with char c in the table

	public String get(char c) {
		// implement
		for(int i=0;i<26;i++)
		{
			if (entries[i].ch==Character.toLowerCase(c))
			{
				return entries[i].str;
			}
		
		}
		return "not a letter index";
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		// implement
		for(int i=0;i<26;i++)
		{
			if (entries[i].ch == c)
			{
				entries[i].str=s;
			}
		
		}
	}
	// returns a String consisting of nicely formatted display
	// of the contents of the table

	public String toString() {
		// implement

		String s="";
		for(int i=0;i<26;i++)
		{
			if (entries[i].str!=null&&entries[i].str.length()!=0)
			{
				s+=entries[i].toString()+"\n";
			}
		
		}
		
		return s;
	}

	private class Entry {
		
		String str;
		char ch;
		Entry(String str, char ch) {
			// implement
			this.str=str;
			this.ch=ch;
			
		}
		
		// returns a String of the form "ch->str"
		public String toString() {
			// implement

			return ch+"->"+str;
		}
	}
}

