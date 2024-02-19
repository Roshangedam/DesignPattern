package DesignPatterns.creational;

interface Button{
	public void display();
}

class WindowsButton implements Button{
	@Override
	public void display() { System.err.println(" displaying windows button ");}
}

class MacButton implements Button{
	@Override
	public void display() { System.err.println(" displaying mac button ");}
}

interface GUIFactory{
	public Button createButton();
}

class WindowsFactory implements GUIFactory{
	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}

class MacFactory implements GUIFactory{
	@Override
	public Button createButton() {
		return new MacButton();
	}
}


class Apllication{
	GUIFactory factory;
	Button button;
	Apllication(GUIFactory factory){
		this.factory=factory;
	}

	void createUI() {
		this.button=factory.createButton();
	}
	void displayUI() {
		button.display();
	}
}

public class AbstarctFactory {

	public static void main(String[] args) {
		Apllication windowsApp = new Apllication(new WindowsFactory());
		windowsApp.createUI();
		windowsApp.displayUI();

		Apllication macApp = new Apllication(new MacFactory());
		macApp.createUI();
		macApp.displayUI();
	}

}
