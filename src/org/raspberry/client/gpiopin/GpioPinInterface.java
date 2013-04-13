package org.raspberry.client.gpiopin;

public interface GpioPinInterface {

	public void setPinNumber(int number);

	public void setPinName(String name);

	public void setPinDescription(String description);

	public void setState(GpioState state);

	public void setPinShape(GpioPinShape shape);

	public void setPinColor(GpioPinColor color);

	public GpioState getState();

	public String getPinDescription();

	public String getPinName();

	public int getPinNumber();

	public GpioPinShape getPinShape();

	public GpioPinColor getPinColor();

}
