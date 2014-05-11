package org.raspberry.client.container;

import org.raspberry.client.container.description.AbstractDescriptionContainer;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;

public abstract class AbstractRaspberryPiHeader extends Composite implements IPiHeaderLayout {

	private Label titleLabel = new Label();
	// "Raspberry Pi P1 Header"
	private FlowPanel mainDiv = new FlowPanel();
	private FlowPanel containerDiv = new FlowPanel();

	private AbstractPinLayout gpioContainer;
	private AbstractDescriptionContainer descriptionContainer;

	public AbstractRaspberryPiHeader(String panelCaption) {
		// TODO Auto-generated constructor stub

		initWidget(mainDiv);
		titleLabel.setText(panelCaption);
		getWidget().addStyleName("gpiocontainer");

		mainDiv.add(titleLabel);
		titleLabel.addStyleName("header caption");

		FlowPanel titleRow = new FlowPanel();
		titleRow.addStyleName("table-header");
		Label first = new Label("Pin #");
		first.addStyleName("header tip first");
		Label second = new Label("Name");
		second.addStyleName("header tip second");
		Label third = new Label("Name");
		third.addStyleName("header tip third");
		Label forth = new Label("Pin #");
		forth.addStyleName("header tip forth");

		titleRow.add(first);
		titleRow.add(second);
		titleRow.add(third);
		titleRow.add(forth);

		mainDiv.add(titleRow);
		mainDiv.add(containerDiv);
		containerDiv.addStyleName("containerDiv");

	}

	@Override
	public void setPinContainer(AbstractPinLayout container) {
		// TODO Auto-generated method stub
		if (container == null)
			return;

		if (gpioContainer != null) {
			containerDiv.remove(gpioContainer);
		}

		this.gpioContainer = container;
		containerDiv.add(gpioContainer);
	}

	@Override
	public void setDescriptionContainer(AbstractDescriptionContainer container) {
		// TODO Auto-generated method stub
		if (container == null)
			return;

		if (descriptionContainer != null) {
			containerDiv.remove(descriptionContainer);
		}

		this.descriptionContainer = container;
		containerDiv.add(descriptionContainer);
	}

	@Override
	public void build() {
		// TODO Auto-generated method stub
		if (gpioContainer == null) {
			throw new RuntimeException("A valid instance of AbstractPinLayout must be present! NULL instead...");
		} else {
			gpioContainer.build();
		}

		if (descriptionContainer != null) {
			descriptionContainer.build();
		}

	}

}
