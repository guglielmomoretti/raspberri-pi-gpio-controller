package org.raspberry.client.gpiopin.event;

import org.raspberry.client.gpiopin.GpioPinState;

import com.google.gwt.event.shared.GwtEvent;

public class GpioPinClickEvent extends GwtEvent<GpioPinClickHandler> {

	public static Type<GpioPinClickHandler> TYPE = new Type<GpioPinClickHandler>();

	private GpioPinState pinState = GpioPinState.OFF;

	private int pinNumber = 0;

	private Object source;

	public GpioPinClickEvent(int pinNumber, GpioPinState state, Object source) {
		// TODO Auto-generated constructor stub
		this.pinState = state;
		this.pinNumber = pinNumber;
		this.source = source;
	}

	@Override
	public Type<GpioPinClickHandler> getAssociatedType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	@Override
	protected void dispatch(GpioPinClickHandler handler) {
		// TODO Auto-generated method stub
		handler.onPinClicked(pinNumber, pinState, source);
	}

	public Object getSource() {
		return source;
	}

	public void setSource(Object source) {
		this.source = source;
	}

}
