package org.raspberry.client.gpiopin;

import com.google.gwt.user.client.ui.IsWidget;

public interface GpioPin extends IsWidget{

	public void setPinNumber(int number);

	public void setPinName(String name);

	public void setPinDescription(String description);

	public void setState(GpioPinState state);

	public void setPinShape(GpioPinShape shape);

	public void setPinColor(GpioPinColor color);

	public GpioPinState getState();

	public String getPinDescription();

	public String getPinName();

	public int getPinNumber();

	public GpioPinShape getPinShape();

	public GpioPinColor getPinColor();

}
