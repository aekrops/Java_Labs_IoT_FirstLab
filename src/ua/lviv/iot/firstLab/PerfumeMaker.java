package ua.lviv.iot.firstLab;

public class PerfumeMaker {

	public static void main(String[] args) {
		Perfume FirstPerfume = new Perfume();
		Perfume SecondPerfume = new Perfume("Giorgio Armani", 500, 200, "aldehyde");
		Perfume ThirdPerfume = new Perfume("Calvin Klein", 650, 200, "aquatic", "Japan", "orange", "unisex");

		System.out.println(FirstPerfume);
		System.out.println(SecondPerfume);
		System.out.println(ThirdPerfume.toString());

		System.out.println();

		System.out.println("Static method:");
		Perfume.printStaticNumberOfPerfumes();
		System.out.println("Un-static method:");
		ThirdPerfume.printNumberOfPerfumes();

		Perfume[] Perfumes = new Perfume[4];
		
		int numberOfCreatedObjects = 0;
		int requiredNumberOfObjects = 4;
		
		while (numberOfCreatedObjects < requiredNumberOfObjects) {
			Perfumes[numberOfCreatedObjects] = new Perfume();
			numberOfCreatedObjects++;
		}
		
		System.out.println();

		for (Perfume perfume : Perfumes) {
			System.out.println(perfume);
		}
	}

}
