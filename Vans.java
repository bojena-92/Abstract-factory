package abstractfactory;

public class Vans implements Brand {

	@Override
	public void chooseBrand() {
		System.out.println("The shoes brand you chose is 'Vans'");
	}

}