package shoesabstractfactory;

public class ShoesAbstractFactoryMain {
	
	public static void main(String[] args) {

		ShoesAbstractFactory brandFactory = ShoesFactoryProducer.getFactory("BRAND");
		Brand vans = brandFactory.getBrand("VANS");
		vans.chooseBrand();
		
		ShoesAbstractFactory colorFactory = ShoesFactoryProducer.getFactory("COLOR");
		Color black = colorFactory.getColor("BLACK");
		black.chooseColor();

	}

}