package org.raspberry.client.container.description;

import com.google.gwt.user.client.ui.FlowPanel;

public abstract class BaseDescription extends FlowPanel implements IDescription {

	private int pinNumber;
	private int gpioPinNumber;
	private String description;

	public BaseDescription() {
		// TODO Auto-generated constructor stub
	}

	public BaseDescription(int pinNumber, int gpioPinNumber, String description) {
		super();
		this.pinNumber = pinNumber;
		this.gpioPinNumber = gpioPinNumber;
		this.description = description;
		addStyleName("description");
	}

	@Override
	public void setPinNumber(int number) {
		// TODO Auto-generated method stub
		this.pinNumber = number;
	}

	@Override
	public void setPinName(String description) {
		// TODO Auto-generated method stub
		this.description = description;
	}

	@Override
	public void setGPIONumber(int gpioPin) {
		// TODO Auto-generated method stub
		this.gpioPinNumber = gpioPin;
	}

	@Override
	public int getPinNumber() {
		// TODO Auto-generated method stub
		return pinNumber;
	}

	@Override
	public String getPinName() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public int getGpioNumber() {
		// TODO Auto-generated method stub
		return gpioPinNumber;
	}

	protected FlowPanel getGpioPanel() {

		FlowPanel panel = new FlowPanel();
		panel.getElement().setInnerText("" + (getGpioNumber() == -1 ? "" : getGpioNumber()));
		panel.addStyleName("gpio-pin");
		return panel;
	}

	protected FlowPanel getPinNamePanel() {

		FlowPanel panel = new FlowPanel();
		panel.getElement().setInnerText(getPinName());
		panel.addStyleName("pin-name");
		return panel;
	}

	protected FlowPanel getPinNumberPanel() {

		FlowPanel panel = new FlowPanel();
		panel.getElement().setInnerText("" + getPinNumber());
		panel.addStyleName("pin-number");
		return panel;
	}

}
