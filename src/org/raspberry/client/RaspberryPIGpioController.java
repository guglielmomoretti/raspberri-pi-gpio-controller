package org.raspberry.client;

import org.raspberry.client.gpiopin.AbstractGpioPin;
import org.raspberry.client.gpiopin.GpioPinColor;
import org.raspberry.client.gpiopin.GpioPinShape;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class RaspberryPIGpioController implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		RootPanel.get("mainDiv").add(new AbstractGpioPin(4, GpioPinColor.BLUE, GpioPinShape.CIRCLE));
		RootPanel.get("mainDiv").add(new AbstractGpioPin(4, GpioPinColor.BLACK, GpioPinShape.CIRCLE));
		RootPanel.get("mainDiv").add(new AbstractGpioPin(4, GpioPinColor.RED, GpioPinShape.CIRCLE));
		RootPanel.get("mainDiv").add(new AbstractGpioPin(4, GpioPinColor.WHITE, GpioPinShape.CIRCLE));
		RootPanel.get("mainDiv").add(new AbstractGpioPin(4, GpioPinColor.ORANGE, GpioPinShape.CIRCLE));
		RootPanel.get("mainDiv").add(new AbstractGpioPin(4, GpioPinColor.VIOLET, GpioPinShape.CIRCLE));
		RootPanel.get("mainDiv").add(new AbstractGpioPin(4, GpioPinColor.BLUE, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add(new AbstractGpioPin(4, GpioPinColor.BLACK, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add(new AbstractGpioPin(4, GpioPinColor.RED, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add(new AbstractGpioPin(4, GpioPinColor.WHITE, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add(new AbstractGpioPin(4, GpioPinColor.ORANGE, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add(new AbstractGpioPin(4, GpioPinColor.VIOLET, GpioPinShape.ROUNDED));
	}
}
