package org.raspberry.client.gpiopin;

public class GpioPinFactory {

	public static GpioPin getGpioPin(int number, GpioPinColor color, GpioPinShape shape) {
		switch (shape) {
		case ROUNDED:
			return new GpioRoundedPin(number, color);
		case SQUARED:
			return new GpioSquaredPin(number, color);
		default:
			break;
		}
		return null;
	}

}
