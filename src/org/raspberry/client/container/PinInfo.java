package org.raspberry.client.container;

import org.raspberry.client.gpiopin.GpioPinColor;
import org.raspberry.client.gpiopin.GpioPinShape;

public class PinInfo implements IPinInfo {
	private GpioPinColor pinColor;
	private int pinNumber;
	private GpioPinShape pinShape;
	private int row = 0;
	private int gpio = 0;

	public PinInfo() {
		// TODO Auto-generated constructor stub
	}

	public PinInfo(GpioPinColor pinColor, int pinNumber, GpioPinShape pinShape, int row, int gpio) {
		super();
		this.pinColor = pinColor;
		this.pinNumber = pinNumber;
		this.pinShape = pinShape;
		this.row = row;
		this.gpio = gpio;
	}

	@Override
	public GpioPinColor getPinColor() {
		return pinColor;
	}

	@Override
	public int getPinNumber() {
		return pinNumber;
	}

	@Override
	public GpioPinShape getPinShape() {
		return pinShape;
	}

	@Override
	public void setPinColor(GpioPinColor pinColor) {
		this.pinColor = pinColor;
	}

	@Override
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	@Override
	public void setPinShape(GpioPinShape pinShape) {
		this.pinShape = pinShape;
	}

	@Override
	public void setPinLayoutRow(int index) {
		// TODO Auto-generated method stub
		this.row = index;
	}

	@Override
	public int getPinLayoutRow() {
		// TODO Auto-generated method stub
		return this.row;
	}

	@Override
	public int getGpioPin() {
		// TODO Auto-generated method stub
		return gpio;
	}

	@Override
	public void setGpioPin(int index) {
		// TODO Auto-generated method stub
		this.gpio = index;
	}

}