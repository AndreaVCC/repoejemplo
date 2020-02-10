package Ejercicio1;

public class TestHerencia3 {
	
	public static void main (String[] args) {
		
		ProductosFrescos pfrescos1 = new ProductosFrescos("29-10-2020",123,"China","01-01-2020");
		System.out.println(pfrescos1.toString());
		
		ProductosFrescos pfrescos2 = new ProductosFrescos("02-07-2021",234,"Japon","01-02-2020");
		System.out.println(pfrescos2.toString());

		ProductosRefrigerados prefrigerado1 = new ProductosRefrigerados("03-03-2020",456,"Mozambique","12-12-2019",17893,-4.5);
		System.out.println(prefrigerado1.toString());

		ProductosRefrigerados prefrigerado2 = new ProductosRefrigerados("18-02-2020",912,"Polonia","23-08-2019",27367,1.5);
		System.out.println(prefrigerado2.toString());

		ProductosRefrigerados prefrigerado3 = new ProductosRefrigerados("25-07-2020",253,"Alemania","02-11-2019",73267,-273);
		System.out.println(prefrigerado3.toString());

		ProductosCongelados pcongelado1 = new ProductosCongelados("24-05-2021",833,"Francia","05-03-2018",5.6);
		System.out.println(pcongelado1.toString());
		
		
	}
	
}
