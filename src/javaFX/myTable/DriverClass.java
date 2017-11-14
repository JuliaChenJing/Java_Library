package javaFX.myTable;
public class DriverClass {
	 public static  void main(String[] args){
	        MyTable t = new MyTable();
	        t.add('a', "Andrew");
	        t.add('b',"Billy");
	        t.add('c',"Charlie");
	        t.add('d',"Dave");
	        t.add('j',"Julia");
	        String s = t.get('b');
	        String s1 = t.get('J');
	        String s2 = t.get('X');
	        String s3 = t.get('?');
	        System.out.println(s);
	        System.out.println(s1);
	        System.out.println(s2);
	        System.out.println(s3);
	        System.out.println();
	        System.out.println(t);
	    }
}
/*
Billy
Julia
null
not a letter index

a->Andrew
b->Billy
c->Charlie
d->Dave
j->Julia
*/
