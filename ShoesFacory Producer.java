package shoesabstractfactory;

public class ShoesFactoryProducer {
	public static ShoesAbstractFactory getFactory(String factory) {
		
		if(factory.equals("COLOR")) {  
			return new ColorFactory(); 
		}
		if(factory.equals("BRAND")) {  
			return new BrandFactory(); 
		}
		
		System.out.println("Unknown factory type");
		return null;
	}
}