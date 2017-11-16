package oop.association_Dependency.compositionDemo.saray;
import java.time.LocalDate;

public class Order{
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	public Order(int orderNo, double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = LocalDate.now();
		this.orderAmount = orderAmount;
	}
	
	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}
	
}
