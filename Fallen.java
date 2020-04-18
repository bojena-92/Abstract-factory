package shoesabstractfactory;

public class Fallen implements Brand {

	@Override
	public void chooseBrand() {
		System.out.println("The shoes brand you chose is 'Fallen'");
	}

}
