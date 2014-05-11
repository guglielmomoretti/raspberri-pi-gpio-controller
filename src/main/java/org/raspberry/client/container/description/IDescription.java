package org.raspberry.client.container.description;

public interface IDescription {

	void setPinNumber(int number);
	
	void setPinName(String description);
	
	void setGPIONumber(int gpioPin);
	
	int getPinNumber();
	
	String getPinName();
	
	int getGpioNumber();
	
}
