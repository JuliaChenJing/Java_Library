package clone;
class Notebook extends Computer implements Cloneable {
	 private double height ;
	 private double width ;
	 private double weight ;
	 
	 Notebook(double height, double width, double weight, String manufacturer,String processor,int ramSize ,int diskSize,double processorSpeed)
	 {
		 super(manufacturer, processor, ramSize , diskSize,processorSpeed);
		 this.height=height;
		 this.weight=weight;
		 this.width=width;
		 
	 }
	 
	 public double screensize() {
		 return height*width;
	 }
	 
	 @Override
	public String toString() {
		return "Notebook [height=" + height + ", width=" + width + ", weight=" + weight + ", manufacturer="
				+ manufacturer + ", processor=" + processor + ", ramSize=" + ramSize + ", diskSize=" + diskSize
				+ ", processorSpeed=" + processorSpeed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notebook other = (Notebook) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
		
	}
	
	public Object clone() throws CloneNotSupportedException {

	    Notebook clone=(Notebook)super.clone();
	    
	    return clone;

	  }
}




