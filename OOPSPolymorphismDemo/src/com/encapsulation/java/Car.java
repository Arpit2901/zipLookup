package com.encapsulation.java;

public class Car {
	
	public int carId;
	public String carName;
	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	
	
	public void carMove()
	{
		System.out.println("Move the car");
	}

}
