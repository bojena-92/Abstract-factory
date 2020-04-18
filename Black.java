package skateshoesabstractfactory;

public class Black implements Color {

	@Override
	public void chooseColor() {
		System.out.println("You've picked black for shoes color");
	}

}