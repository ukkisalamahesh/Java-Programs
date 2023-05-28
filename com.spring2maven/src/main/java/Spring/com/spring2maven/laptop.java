package Spring.com.spring2maven;

public class laptop {
String brand;
int cost;
@Override
public String toString() {
	return "laptop [brand=" + brand + ", cost=" + cost + "]";
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public laptop() {
	super();
	// TODO Auto-generated constructor stub
}
public laptop(String brand, int cost) {
	super();
	this.brand = brand;
	this.cost = cost;
}
}
