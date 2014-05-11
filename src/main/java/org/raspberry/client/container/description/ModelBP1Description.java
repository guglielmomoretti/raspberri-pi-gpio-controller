package org.raspberry.client.container.description;

import java.util.Arrays;
import java.util.List;

import org.raspberry.client.container.IPinLayout;

import com.google.gwt.user.client.ui.FlowPanel;

public class ModelBP1Description extends AbstractDescriptionContainer {

	public static List<Integer> MODELB_20_PININDEX_GPIO = Arrays.asList(-1, -1, 8, -1, 9, -1, 7, 15, -1, 16, 0, 1, 2, -1, 3, 4, -1, 5, 12,
			-1, 13, 6, 14, 10, -1, 11);

	public static List<String> MODELB_20_PININDEX_PINNAME = Arrays.asList("3.3 VDC Power", "5.0 VDC Power", "SDA0 (I2C)", "DNC",
			"SCL0 (I2C)", "0V (Ground)", "GPIO 7", "TxD", "DNC", "RxD", "GPIO 0", "GPIO 1", "GPIO 2", "DNC", "GPIO 3", "GPIO 4", "DNC",
			"GPIO 5", "MOSI", "DNC", "MISO", "GPIO6", "SCLK", "CE0", "DNC", "CE1");

	private FlowPanel rightPanel = new FlowPanel();
	private FlowPanel leftPanel = new FlowPanel();

	public ModelBP1Description(IPinLayout pinLayout) {
		super(pinLayout);
		leftPanel.addStyleName("left");
		rightPanel.addStyleName("right");
		add(leftPanel);
		add(rightPanel);
	}

	@Override
	public void build() {
		// TODO Auto-generated method stub

		for (int i = 1; i < pinLayout.getPinCount() + 1; i++) {

			BaseDescription desc = null;

			if (i % 2 == 0) {
				desc = new RightDescription(i, MODELB_20_PININDEX_GPIO.get(i - 1), MODELB_20_PININDEX_PINNAME.get(i - 1));
			} else {
				desc = new LeftDescription(i, MODELB_20_PININDEX_GPIO.get(i - 1), MODELB_20_PININDEX_PINNAME.get(i - 1));
			}

			addDescription(desc);
		}

	}

	@Override
	public void addDescription(BaseDescription description) {
		// TODO Auto-generated method stub
		addDescriptionToRegistry(description);
		if (description.getPinNumber() % 2 == 0) {
			rightPanel.add(description);
		} else {
			leftPanel.add(description);
		}
	}

	@Override
	public void removeDescription(BaseDescription description) {
		// TODO Auto-generated method stub
		removeDescriptionFromRegistry(description);
		if (description.getPinNumber() % 2 == 0) {
			rightPanel.remove(description);
		} else {
			leftPanel.remove(description);
		}
	}
}
