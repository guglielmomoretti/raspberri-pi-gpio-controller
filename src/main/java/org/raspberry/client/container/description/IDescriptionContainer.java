package org.raspberry.client.container.description;

public interface IDescriptionContainer {

	BaseDescription getDescriptionFor(int pinIndex);
	
	public void addDescription(BaseDescription description);
	
	public void removeDescription(BaseDescription description);
	
	public void build();
}
