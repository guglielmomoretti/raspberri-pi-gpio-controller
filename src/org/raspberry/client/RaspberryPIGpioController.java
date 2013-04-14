package org.raspberry.client;

import org.raspberry.client.gpiopin.GpioPinColor;
import org.raspberry.client.gpiopin.GpioPinFactory;
import org.raspberry.client.gpiopin.GpioPinShape;
import org.raspberry.client.gpiopin.GpioPinState;
import org.raspberry.client.gpiopin.event.GpioPinStateEvent;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.SimpleEventBus;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class RaspberryPIGpioController implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		RootPanel.get("mainDiv").add((Widget) GpioPinFactory.getGpioPin(1, GpioPinColor.BLUE, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add((Widget) GpioPinFactory.getGpioPin(2, GpioPinColor.BLACK, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add((Widget) GpioPinFactory.getGpioPin(3, GpioPinColor.RED, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add((Widget) GpioPinFactory.getGpioPin(4, GpioPinColor.WHITE, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add((Widget) GpioPinFactory.getGpioPin(5, GpioPinColor.ORANGE, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add((Widget) GpioPinFactory.getGpioPin(6, GpioPinColor.VIOLET, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add((Widget) GpioPinFactory.getGpioPin(7, GpioPinColor.BLUE, GpioPinShape.SQUARED));
		RootPanel.get("mainDiv").add((Widget) GpioPinFactory.getGpioPin(8, GpioPinColor.BLACK, GpioPinShape.SQUARED));
		RootPanel.get("mainDiv").add((Widget) GpioPinFactory.getGpioPin(9, GpioPinColor.RED, GpioPinShape.SQUARED));
		RootPanel.get("mainDiv").add((Widget) GpioPinFactory.getGpioPin(10, GpioPinColor.WHITE, GpioPinShape.SQUARED));
		RootPanel.get("mainDiv").add((Widget) GpioPinFactory.getGpioPin(11, GpioPinColor.ORANGE, GpioPinShape.SQUARED));
		RootPanel.get("mainDiv").add((Widget) GpioPinFactory.getGpioPin(12, GpioPinColor.VIOLET, GpioPinShape.SQUARED));

		RaspberryPiUtils.EVENT_BUS.fireEvent(new GpioPinStateEvent(1, GpioPinState.ON));

		RaspberryPiUtils.EVENT_BUS.fireEvent(new GpioPinStateEvent(5, GpioPinState.ON));

		RaspberryPiUtils.EVENT_BUS.fireEvent(new GpioPinStateEvent(8, GpioPinState.ON));
	}
}
