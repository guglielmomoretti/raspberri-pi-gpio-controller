package org.raspberry.client.gpiopin.event;

import org.raspberry.client.gpiopin.GpioPinState;

import com.google.gwt.event.shared.EventHandler;

public interface GpioPinStateHandler extends EventHandler {

	public void onPinStateChanged(int pinNumber, GpioPinState state);

}
