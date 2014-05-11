package org.raspberry.client.container;

import org.raspberry.client.gpiopin.GpioPinColor;
import org.raspberry.client.gpiopin.GpioPinShape;

public interface IPinInfo {
	public GpioPinColor getPinColor();

	public int getPinNumber();

	public GpioPinShape getPinShape();

	public void setPinColor(GpioPinColor pinColor);

	public void setPinNumber(int pinNumber);

	public void setPinShape(GpioPinShape pinShape);

	public void setPinLayoutRow(int index);
	
	public int getPinLayoutRow();
	
	public int getGpioPin();
	
	public void setGpioPin(int index);
}
