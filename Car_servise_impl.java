package carservice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Car_servise_impl implements Car_Services {
	Map<String, Hatchback> db = new LinkedHashMap<String, Hatchback>();
	Map<String, Sedan> db1 = new LinkedHashMap<String, Sedan>();
	Map<String, SUV> db2 = new LinkedHashMap<String, SUV>();
	//	2 database
	Scanner sc = new Scanner(System.in);
	int totalBill = 0;

	@Override
	public void add_car() {

		db.put("ES01", new Hatchback("Basic_Service", 2000));
		db.put("EF01", new Hatchback("Engine_Fixing", 4000));
		db.put("CF01", new Hatchback("Clutch_Fixing", 5000));
		db.put("BF01", new Hatchback("Brake_Fixing", 5000));
		db.put("GF01", new Hatchback("Gear_Fixing", 5000));

		db1.put("ES01", new Sedan("Basic_Service", 2000));
		db1.put("EF01", new Sedan("Engine_Fixing", 4000));
		db1.put("CF01", new Sedan("Clutch_Fixing", 5000));
		db1.put("BF01", new Sedan("Brake_Fixing", 5000));
		db1.put("GF01", new Sedan("Gear_Fixing", 5000));

		db2.put("ES01", new SUV("Basic_Service", 2000));
		db2.put("EF01", new SUV("Engine_Fixing", 4000));
		db2.put("CF01", new SUV("Clutch_Fixing", 5000));
		db2.put("BF01", new SUV("Brake_Fixing", 5000));
		db2.put("GF01", new SUV("Gear_Fixing", 5000));

	}

	@Override
	public void buyService() {
		while(true) {
			System.out.println("enter type of car :");
			String name = sc.next();
			name = name.toUpperCase();

			if (name.compareTo("HATCHBACK") == 0) {
				System.out.println("enter the service code:");
				while (true) {
					String service_code = sc.next();
					service_code = service_code.toUpperCase();
					//				System.out.println(service_code);
					if (db.containsKey(service_code)) {
						Car c = db.get(service_code);
						System.out.println("charges for " + db.get(service_code).getService() + " - "
								+ db.get(service_code).getCost());
						totalBill = totalBill + c.getCost();
						System.out.println("if you want other services then enter service code else enter 0");
					} else if (service_code.compareTo("0") == 0) {
						checkOut();
					} else {
						System.out.println("enter valid code");
					}
				}

			} else if (name.compareTo("SEDAN") == 0) {
				System.out.println("enter the service code:");
				while (true) {
					String service_code = sc.next();
					service_code = service_code.toUpperCase();
					if (db1.containsKey(service_code)) {
						Car c = db1.get(service_code);
						System.out.println("charges for " + db1.get(service_code).getService() + " - "
								+ db1.get(service_code).getCost());
						totalBill = totalBill + c.getCost();
						System.out.println("if you want other services then enter service code else enter 0");
					} else if (service_code.compareTo("0") == 0) {
						checkOut();
					} else {
						System.out.println("enter valid code");
					}
				}

			} else if (name.compareTo("SUV") == 0) {
				System.out.println("enter the service code:");
				while (true) {
					String service_code = sc.next();
					service_code = service_code.toUpperCase();
					if (db2.containsKey(service_code)) {
						Car c = db2.get(service_code);
						System.out.println("charges for " + db2.get(service_code).getService() + " - "
								+ db2.get(service_code).getCost());
						totalBill = totalBill + c.getCost();
						System.out.println("if you want other services then enter service code else enter 0");
					} else if (service_code.compareTo("0") == 0) {
						checkOut();
					} else {
						System.out.println("enter valid code");
					}
				}

			} else {
				System.out.println("make valid choice ");
			}
		}

	}
	
	public void checkOut() {
		if (totalBill > 10000) {
			System.out.println("your total bill is: " + totalBill + "\nyour bill amount is more than 10000\nyou got free complimentary cleaning ");
		} else {
			System.out.println("Total Bill – " + totalBill);
		}
		System.out.println("thank you for comming");
		System.exit(0);
	}

}
