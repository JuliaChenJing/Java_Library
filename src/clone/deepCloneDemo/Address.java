package clone.deepCloneDemo;


public class Address implements Cloneable 
{
	String houseNo;
	String address1;
	String address2;
	int zipcode;
	
	public Address(String houseNo, String address1, String address2, int zipcode) {
		this.houseNo = houseNo;
		this.address1 = address1;
		this.address2 = address2;
		this.zipcode = zipcode;
	}
	 public Object clone() throws CloneNotSupportedException {

		    Address clone=(Address)super.clone();
			return clone;
	 }
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	 	
}
