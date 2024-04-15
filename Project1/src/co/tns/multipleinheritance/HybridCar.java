package co.tns.multipleinheritance;

public class HybridCar implements  CngCar,PetrolCar{

	@Override
	public void petrolKit() {// TODO Auto-generated method stub
		System.out.println("Petrol kit");
	}

	@Override
	public void drive() {
		System.out.println("driving");
		
	}

	@Override
	public void cngKit() {
		// TODO Auto-generated method stub
		System.out.println("CNG Kit");
		
	}


}
