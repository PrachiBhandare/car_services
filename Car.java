package carservice;

public class Car {
 private String Service;
 private int cost;
 
public Car(String service, int cost) {
	super();
	Service = service;
	this.cost = cost;
}

public String getService() {
	return Service;
}

public void setService(String service) {
	Service = service;
}

public int getCost() {
	return cost;
}

public void setCost(int cost) {
	this.cost = cost;
}
 
 
}
