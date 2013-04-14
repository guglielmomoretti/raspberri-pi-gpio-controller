package org.raspberry.client.gpiopin;

public enum GpioPinShape {

	ROUNDED {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "circle";
		}
	},
	SQUARED {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "rounded";
		}
	}

}
