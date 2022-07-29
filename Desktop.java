package org.system;

public class Desktop extends Computer {//Child/Base class extends parent class

	public void desktopSize() {

	}

	public static void main(String[] args) {

		Desktop c = new Desktop(); //create obj
		c.computerModel(); //calling the parent class method
		c.desktopSize();
	}

}
