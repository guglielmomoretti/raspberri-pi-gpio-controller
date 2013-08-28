package org.raspberry.client.container.description;

public class RightDescription extends BaseDescription {

	public RightDescription(int pinNumber, int gpioPinNumber, String description) {
		super(pinNumber, gpioPinNumber, description);
		addStyleName("dx");
		add(getPinNumberPanel());
		add(getPinNamePanel());
		add(getGpioPanel());
	}

}
