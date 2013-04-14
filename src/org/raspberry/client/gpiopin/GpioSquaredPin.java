package org.raspberry.client.gpiopin;

public class GpioSquaredPin extends AbstractGpioPin {

	public GpioSquaredPin(int pinNumber, GpioPinColor color) {
		super(pinNumber, color, GpioPinShape.SQUARED);
	}

	@Override
	public void onPinStateChanged(int pinNumber, GpioPinState state) {
		// TODO Auto-generated method stub
		System.out.println("Ricevuto evento!!! --> pin " + pinNumber + " ora è " + state);
	}
}
