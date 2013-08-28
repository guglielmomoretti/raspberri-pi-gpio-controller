package org.raspberry.client.container.description;

public class LeftDescription extends BaseDescription {

	public LeftDescription(int pinNumber, int gpioPinNumber, String description) {
		super(pinNumber, gpioPinNumber, description);
		add(getGpioPanel());
		add(getPinNamePanel());
		add(getPinNumberPanel());
	}

}
