package org.raspberry.client.container.description;

import java.util.HashMap;

import org.raspberry.client.container.IPinLayout;

import com.google.gwt.user.client.ui.FlowPanel;

public abstract class AbstractDescriptionContainer extends FlowPanel implements IDescriptionContainer {

	protected HashMap<Integer, BaseDescription> descriptionList = new HashMap<Integer, BaseDescription>();
	protected IPinLayout pinLayout;

	public AbstractDescriptionContainer(IPinLayout pinLayout) {
		// TODO Auto-generated constructor stub
		this.pinLayout = pinLayout;
		addStyleName("pin-description-container");
	}

	@Override
	public BaseDescription getDescriptionFor(int pinIndex) {
		// TODO Auto-generated method stub
		return descriptionList.get(pinIndex);
	}
	
	protected final void addDescriptionToRegistry(BaseDescription description) {
		// TODO Auto-generated method stub
		descriptionList.put(description.getPinNumber(), description);
	}
	
	protected final void removeDescriptionFromRegistry(BaseDescription description) {
		// TODO Auto-generated method stub
		descriptionList.remove(description.getPinNumber());
	}

}
