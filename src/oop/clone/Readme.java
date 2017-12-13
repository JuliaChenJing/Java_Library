package oop.clone;

public class Readme {
	/*
	 * Shallow Copy in Java: The default version of clone() method creates the
	 * shallow copy of an object. The shallow copy of an object will have exact
	 * copy of all the fields of original object. If original object has any
	 * references to other objects as fields, then only references of those
	 * objects are copied into clone object, copy of those objects are not
	 * created. 
	 * 
	 * That means any changes made to those objects through clone
	 * object will be reflected in original object or vice-versa. Shallow copy
	 * is not 100% disjoint from original object. Shallow copy is not 100%
	 * independent of original object. 
	 * 
	 * 
	 * Deep Copy In Java : Deep copy of an
	 * object will have exact copy of all the fields of original object just
	 * like shallow copy. 
	 * 
	 * But in additional, if original object has any
	 * references to other objects as fields, then copy of those objects are
	 * also created by calling clone() method on them.
	 * 
	 */
}
