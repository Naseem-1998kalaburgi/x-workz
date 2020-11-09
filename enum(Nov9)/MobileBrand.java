enum Brand
{
	SAMSUNG,ONEPLUS,NOKIA,VIVO,OPPO
}

public class MobileBrand{

public static void main(String[] model)
{
	
	String mobileBrand="VIVO";
	
	Brand convertedBrandFromString=Brand.valueOf(mobileBrand);
	
	System.out.println(convertedBrandFromString);
	
	
	Brand[] allBrand=Brand.values();
	System.out.println(allBrand.length);
	//length will be +1 of index
	for(int brandsInitial=0;brandsInitial<allBrand.length;brandsInitial++){
		System.out.println("index " + brandsInitial);
		Brand brandValue=allBrand[brandsInitial];
		System.out.println("brand enum Value " + brandValue);
		
	}
	
	

}

}