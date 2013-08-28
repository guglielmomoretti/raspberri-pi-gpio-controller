package org.raspberry.client;

import java.util.Arrays;
import java.util.List;

import org.raspberry.client.container.PinInfo;
import org.raspberry.client.gpiopin.GpioPinColor;
import org.raspberry.client.gpiopin.GpioPinShape;

import com.google.gwt.core.client.GWT;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

public class RaspberryPiUtils {

	public static EventBus EVENT_BUS = GWT.create(SimpleEventBus.class);

	public static PinInfo getDefaultPinInfoFromPinIndex(int index) {

		PinInfo retWrapper = new PinInfo();
		retWrapper.setPinShape(GpioPinShape.ROUNDED);
		retWrapper.setPinNumber(index);

		switch (index) {
		case 1:
			retWrapper.setPinShape(GpioPinShape.SQUARED);
			retWrapper.setPinColor(GpioPinColor.ORANGE);

			break;
		case 2:
			retWrapper.setPinColor(GpioPinColor.RED);
			break;
		case 6:
			retWrapper.setPinColor(GpioPinColor.BLACK);
			break;
		case 8:
		case 10:
			retWrapper.setPinColor(GpioPinColor.ORANGE);
			break;
		case 19:
		case 21:
		case 23:
		case 24:
		case 26:
			retWrapper.setPinColor(GpioPinColor.VIOLET);
			break;
		case 7:
		case 11:
		case 12:
		case 13:
		case 15:
		case 16:
		case 18:
		case 22:
			retWrapper.setPinColor(GpioPinColor.GREEN);
			break;
		case 4:
		case 9:
		case 14:
		case 17:
		case 20:
		case 25:
			retWrapper.setPinColor(GpioPinColor.WHITE);
			break;
		case 3:
		case 5:
			retWrapper.setPinColor(GpioPinColor.BLUE);
			break;
		default:
			break;
		}

		return retWrapper;
	}
}
