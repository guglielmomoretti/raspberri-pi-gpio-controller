package org.raspberry.client.container;

import org.raspberry.client.gpiopin.GpioPin;

public class RowInfo {

	private GpioPin leftPin;
	private GpioPin rightPin;

	private int rowIndex;

	public GpioPin getLeftPin() {
		return leftPin;
	}

	public void setLeftPin(GpioPin leftPin) {
		this.leftPin = leftPin;
	}

	public GpioPin getRightPin() {
		return rightPin;
	}

	public void setRightPin(GpioPin rightPin) {
		this.rightPin = rightPin;
	}

	public int getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	public RowInfo(GpioPin leftPin, GpioPin rightPin, int rowIndex) {
		super();
		this.leftPin = leftPin;
		this.rightPin = rightPin;
		this.rowIndex = rowIndex;
	}

}
