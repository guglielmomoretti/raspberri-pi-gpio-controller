package org.raspberry.client.container;

import org.raspberry.client.container.description.AbstractDescriptionContainer;

public interface IPiHeaderLayout {

	public void setPinContainer(AbstractPinLayout container);
	public void setDescriptionContainer(AbstractDescriptionContainer container);
	
	public void build();
}
