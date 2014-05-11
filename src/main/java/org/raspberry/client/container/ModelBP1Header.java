package org.raspberry.client.container;

import org.raspberry.client.container.description.ModelBP1Description;

public class ModelBP1Header extends AbstractRaspberryPiHeader {

	public ModelBP1Header() {
		super("Raspberry Pi P1 Header");
		// TODO Auto-generated constructor stub
		ModelBP1PinLayout container = new ModelBP1PinLayout();
		setPinContainer(container);
		setDescriptionContainer(new ModelBP1Description(container));
		build();
	}

}
