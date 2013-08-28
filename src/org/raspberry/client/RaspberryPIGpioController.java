package org.raspberry.client;

import org.raspberry.client.container.AbstractRaspberryPiHeader;
import org.raspberry.client.container.AbstractPinLayout;
import org.raspberry.client.container.ModelBP1Header;
import org.raspberry.client.gpiopin.GpioPinColor;
import org.raspberry.client.gpiopin.GpioPinFactory;
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

		/*RootPanel.get("mainDiv").add(GpioPinFactory.getGpioPin(1, GpioPinColor.BLUE, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add(GpioPinFactory.getGpioPin(2, GpioPinColor.BLACK, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add(GpioPinFactory.getGpioPin(3, GpioPinColor.RED, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add(GpioPinFactory.getGpioPin(4, GpioPinColor.WHITE, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add(GpioPinFactory.getGpioPin(5, GpioPinColor.ORANGE, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add(GpioPinFactory.getGpioPin(6, GpioPinColor.VIOLET, GpioPinShape.ROUNDED));
		RootPanel.get("mainDiv").add(GpioPinFactory.getGpioPin(7, GpioPinColor.BLUE, GpioPinShape.SQUARED));
		RootPanel.get("mainDiv").add(GpioPinFactory.getGpioPin(8, GpioPinColor.BLACK, GpioPinShape.SQUARED));
		RootPanel.get("mainDiv").add(GpioPinFactory.getGpioPin(9, GpioPinColor.RED, GpioPinShape.SQUARED));
		RootPanel.get("mainDiv").add(GpioPinFactory.getGpioPin(10, GpioPinColor.WHITE, GpioPinShape.SQUARED));
		RootPanel.get("mainDiv").add(GpioPinFactory.getGpioPin(11, GpioPinColor.ORANGE, GpioPinShape.SQUARED));
		RootPanel.get("mainDiv").add(GpioPinFactory.getGpioPin(12, GpioPinColor.VIOLET, GpioPinShape.SQUARED));
*/
		RootPanel.get("mainDiv").add(new ModelBP1Header());

	}
}
