package org.raspberry.client.controller;

import org.raspberry.client.RaspberryPiUtils;
import org.raspberry.client.gpiopin.GpioPinState;
import org.raspberry.client.gpiopin.event.GpioPinClickEvent;
import org.raspberry.client.gpiopin.event.GpioPinClickHandler;

public class GpioController implements GpioPinClickHandler {

	public GpioController() {
		// TODO Auto-generated constructor stub
		RaspberryPiUtils.EVENT_BUS.addHandler(GpioPinClickEvent.TYPE, this);
	}

	@Override
	public void onPinClicked(int pinNumber, GpioPinState state, Object source) {
		// TODO Auto-generated method stub

	}

}
