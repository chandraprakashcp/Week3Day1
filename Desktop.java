package org.system;

public class Desktop extends Computer {

	public void DesktopSize() {
		System.out.println("The Desktop size is 15.5 inch");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop dsk= new Desktop();
		dsk.DesktopSize();
		dsk.ComputerModel();
		
	}

}
