package org.raspberry.client.container;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;

public abstract class AbstractPinLayout extends Composite implements IPinLayout {

	private FlowPanel gpioContentDiv = new FlowPanel();
	protected FlowPanel pinContainerDiv = new FlowPanel();

	public AbstractPinLayout() {
		initWidget(gpioContentDiv);
		gpioContentDiv.add(pinContainerDiv);
	}

	abstract public void build();

}
