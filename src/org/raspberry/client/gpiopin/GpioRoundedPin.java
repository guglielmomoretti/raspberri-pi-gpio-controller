package org.raspberry.client.gpiopin;

public class GpioRoundedPin extends AbstractGpioPin {

	public GpioRoundedPin(int pinNumber, GpioPinColor color) {
		super(pinNumber, color, GpioPinShape.ROUNDED);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onPinStateChanged(int pinNumber, GpioPinState state) {
		// TODO Auto-generated method stub
		System.out.println("Ricevuto evento!!! --> pin " + pinNumber + " ora è " + state);
	}

}
