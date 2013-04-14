package org.raspberry.client.gpiopin;

import org.raspberry.client.RaspberryPiUtils;
import org.raspberry.client.gpiopin.event.GpioPinStateEvent;
import org.raspberry.client.gpiopin.event.GpioPinStateHandler;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.SimpleEventBus;

public abstract class AbstractGpioPin extends Widget implements GpioPin, GpioPinStateHandler {

	protected static final String OUTER_SHAPE_CSS_STYLE_NAME = "outer";
	protected static final String INNER_SHAPE_CSS_STYLE_NAME = "inner";
	protected static final String INNER_SHAPE_CSS_COLOR_STYLE_NAME = "white";
	protected static final String INNER_SHAPE_CSS_BOX_STYLE_NAME = "circle";

	protected final Element innerShapeElement = DOM.createDiv();

	private int pinNumber = -1;
	private String pinName = "-";
	private String pinDescription = "-";
	private GpioPinState pinState = GpioPinState.OFF;
	private GpioPinShape pinShape = GpioPinShape.ROUNDED;
	private GpioPinColor pinColor = GpioPinColor.BLUE;

	public AbstractGpioPin(int pinNumber, GpioPinColor color, GpioPinShape shape) {
		// TODO Auto-generated constructor stub
		setElement(DOM.createDiv());
		setPinNumber(pinNumber);
		setPinColor(color);
		setPinShape(shape);
		init();
	}

	private void init() {
		// imposto lo stile predefinito alla shape esterna
		getElement().addClassName(OUTER_SHAPE_CSS_STYLE_NAME);

		// aggiungo il pallino tondo (l'interno del pin) all pin padre
		getElement().appendChild(innerShapeElement);
		innerShapeElement.addClassName(INNER_SHAPE_CSS_STYLE_NAME);
		innerShapeElement.addClassName(INNER_SHAPE_CSS_COLOR_STYLE_NAME);
		innerShapeElement.addClassName(INNER_SHAPE_CSS_BOX_STYLE_NAME);

		// add the event handler for the events coming from the GWT event bus
		RaspberryPiUtils.EVENT_BUS.addHandler(GpioPinStateEvent.TYPE, new GpioPinStateHandler() {

			@Override
			public void onPinStateChanged(int pinNumber, GpioPinState state) {
				// TODO Auto-generated method stub
				if (pinNumber == getPinNumber())
					AbstractGpioPin.this.onPinStateChanged(pinNumber, state);
			}
		});

	}

	@Override
	public void setPinNumber(int number) {
		// TODO Auto-generated method stub
		this.pinNumber = number;
	}

	@Override
	public void setPinName(String name) {
		// TODO Auto-generated method stub
		this.pinName = name;
	}

	@Override
	public void setPinDescription(String description) {
		// TODO Auto-generated method stub
		this.pinDescription = description;
	}

	@Override
	public void setState(GpioPinState state) {
		// TODO Auto-generated method stub
		this.pinState = state;
	}

	@Override
	public GpioPinState getState() {
		// TODO Auto-generated method stub
		return pinState;
	}

	@Override
	public String getPinDescription() {
		// TODO Auto-generated method stub
		return pinDescription;
	}

	@Override
	public String getPinName() {
		// TODO Auto-generated method stub
		return pinName;
	}

	@Override
	public int getPinNumber() {
		// TODO Auto-generated method stub
		return pinNumber;
	}

	@Override
	public void setPinShape(GpioPinShape shape) {
		// rimuovo l'attuale classe
		getElement().removeClassName(this.pinShape.toString());
		// si imposta la nuova class
		this.pinShape = shape;
		// aggiungo la classe attuale
		getElement().addClassName(this.pinShape.toString());

	}

	@Override
	public GpioPinShape getPinShape() {
		// TODO Auto-generated method stub
		return this.pinShape;
	}

	@Override
	public void setPinColor(GpioPinColor color) {

		// rimuovo l'attuale classe
		getElement().removeClassName(this.pinColor.toString());
		// si imposta la nuova class
		this.pinColor = color;
		// aggiungo la classe attuale
		getElement().addClassName(this.pinColor.toString());
	}

	@Override
	public GpioPinColor getPinColor() {
		// TODO Auto-generated method stub
		return pinColor;
	}

}
