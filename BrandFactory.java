package shoesabstractfactory;

public class BrandFactory extends ShoesAbstractFactory {
	@Override
	Color getColor(String color) {
		// Brand factory does not have getColor implementation
		return null;
	}

	@Override
	Brand getBrand(String brand) {  

		if(brand.equals("FALLEN")) { 
			return new Fallen();
		}
		
		if(brand.equals("VANS")) { 
			return new Vans();
		}
		
		// Unknown brand type
		System.out.println("Unknown brand type");   
		return null;
	}

}
