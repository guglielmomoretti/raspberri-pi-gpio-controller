package org.raspberry.client.gpiopin.event;

import org.raspberry.client.gpiopin.GpioPinState;

import com.google.gwt.event.shared.GwtEvent;

public class GpioPinStateEvent extends GwtEvent<GpioPinStateHandler> {

	public static Type<GpioPinStateHandler> TYPE = new Type<GpioPinStateHandler>();

	private GpioPinState pinState = GpioPinState.OFF;

	private int pinNumber = 0;

	public GpioPinStateEvent(int pinNumber, GpioPinState state) {
		// TODO Auto-generated constructor stub
		this.pinState = state;
		this.pinNumber = pinNumber;
	}

	@Override
	public Type<GpioPinStateHandler> getAssociatedType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	@Override
	protected void dispatch(GpioPinStateHandler handler) {
		// TODO Auto-generated method stub
		handler.onPinStateChanged(pinNumber, pinState);
	}
}
