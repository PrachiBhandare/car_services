package carservice;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("welcome to Car service center:");
		System.out.println("*******************************************");
	
		Car_Services service = new Car_servise_impl();
		service.add_car();
		service.buyService();
		service.checkOut();
	}
}
