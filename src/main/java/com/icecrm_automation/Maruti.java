package com.icecrm_automation;

public class Maruti {
	
	protected static final String White = null;

	public static void main(String[]args) {
	 
		Car car=new Car() {
		
			public void engine() {
				System.out.println("800 cc Emgine");
		}

			public String color() {
				
				return "White" ;
			}

			public void fuelType() {
				System.out.println("CNG");
				
				
			}

    };
    
    car.engine();
   System.out.println(car.color());
    car.fuelType();
}
}