package shoesabstractfactory;

public class ColorFactory  extends ShoesAbstractFactory{
	@Override
	Color getColor(String color) {
		
		if(color.equals("BLACK")) {  
			return new Black();
		}
		
		if(color.equals("BEIGE")) {  
			return new Beige();
		}
		
		// Unknown color type
		return null;
	}

	@Override
	Brand getBrand(String brand) {
		// Color factory does not have getBrand implementation
		return null;
	}
}