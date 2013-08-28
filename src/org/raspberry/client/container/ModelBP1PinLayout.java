package org.raspberry.client.container;

import java.util.HashMap;

import org.raspberry.client.GpioControllerStyles;
import org.raspberry.client.RaspberryPiUtils;
import org.raspberry.client.gpiopin.GpioPin;
import org.raspberry.client.gpiopin.GpioPinFactory;

import com.github.gwtbootstrap.client.ui.Row;
import com.google.gwt.user.client.ui.InsertPanel.ForIsWidget;

public class ModelBP1PinLayout extends AbstractPinLayout {

	private HashMap<Integer, RowInfo> rowInfo = new HashMap<Integer, RowInfo>();
	private HashMap<Integer, PinInfo> pinInfo = new HashMap<Integer, PinInfo>();
	private String containerDescription = "Raspberry Pi  Model B 2.0 P1 Header";

	public ModelBP1PinLayout() {
		// TODO Auto-generated constructor stub
		super();

		setStyleName(GpioControllerStyles.GPIO_CONTENT);
		pinContainerDiv.setStyleName(GpioControllerStyles.PIN_CONTAINER);
	}

	@Override
	public void build() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 14; i++) {

			Row row = new Row();
			row.addStyleName("pinline");

			PinInfo left = RaspberryPiUtils.getDefaultPinInfoFromPinIndex(i + (i - 1));
			PinInfo right = RaspberryPiUtils.getDefaultPinInfoFromPinIndex(i + i);

			RowInfo gpioRowInfo = addGpioRow(row, i - 1, left, right);

			// info left pin

			pinInfo.put(left.getPinNumber(), left);
			// info right pin
			pinInfo.put(right.getPinNumber(), right);
			// info row
			rowInfo.put(i, gpioRowInfo);

			pinContainerDiv.add(row);
			/* lastRow = currentRow + 1; */
		}
	}

	@Override
	public RowInfo getRowInfo(int row) {
		return rowInfo.get(row);
	}

	@Override
	public PinInfo getPinInfo(int pin) {
		return pinInfo.get(pin);
	}

	private RowInfo addGpioRow(ForIsWidget container, int rowIndex, PinInfo leftPin, PinInfo rightPin) {

		GpioPin leftGpio = GpioPinFactory.getGpioPin(leftPin.getPinNumber(), leftPin.getPinColor(), leftPin.getPinShape());
		GpioPin rightGpio = GpioPinFactory.getGpioPin(rightPin.getPinNumber(), rightPin.getPinColor(), rightPin.getPinShape());

		// aggiunge il pin al container
		container.add(leftGpio);
		container.add(rightGpio);

		RowInfo resultInfo = new RowInfo(leftGpio, rightGpio, rowIndex);
		return resultInfo;
	}

	@Override
	public String getContainerDescription() {
		// TODO Auto-generated method stub
		return containerDescription;
	}

	@Override
	public void setContainerDescription(String description) {
		// TODO Auto-generated method stub
		this.containerDescription = description;
	}

	@Override
	public int getPinCount() {
		// TODO Auto-generated method stub
		return pinInfo.size();
	}
}
