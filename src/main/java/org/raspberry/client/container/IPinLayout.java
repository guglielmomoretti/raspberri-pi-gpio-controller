package org.raspberry.client.container;

public interface IPinLayout {

	PinInfo getPinInfo(int pinIndex);
	RowInfo getRowInfo(int rowIndex);
	
	String getContainerDescription();
	public void setContainerDescription(String dscription);

	public int getPinCount();

}
