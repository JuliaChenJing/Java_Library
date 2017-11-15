package oop.shape.closedCurveFactory.best;

import java.util.HashMap;
import java.util.Map;

public class Factory {
	
	@SuppressWarnings("serial")
	Map<Type, ClosedCurve> map = new HashMap<Type, ClosedCurve>(){
		{
			put(Type.CIRCLE, new Circle());
			put(Type.RECTANGLE, new Rectangle());
		}
	};

	// use getShape method to get object of type shape
	public ClosedCurve getShape(Type type) {
		if (map.containsKey(type))
			return map.get(type);
		throw new IllegalArgumentException("no such type found!");
	}
}