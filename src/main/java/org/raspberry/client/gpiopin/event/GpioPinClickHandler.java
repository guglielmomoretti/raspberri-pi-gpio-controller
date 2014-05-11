package org.raspberry.client.gpiopin.event;

import org.raspberry.client.gpiopin.GpioPinState;

import com.google.gwt.event.shared.EventHandler;

public interface GpioPinClickHandler extends EventHandler {

	public void onPinClicked(int pinNumber, GpioPinState state, Object source);
}
