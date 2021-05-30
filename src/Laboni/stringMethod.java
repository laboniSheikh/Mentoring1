package Laboni;

public class stringMethod {

	public static void main(String[] args) {
		 
		String place="Europe";
		String country="Italy is a beautiful country in Europe";
		   
			System.out.println(place.toUpperCase());
			System.out.println(country.toUpperCase());
			System.out.println(place.length());
			System.out.println(country.length());
			System.out.println(place.charAt(4));
			System.out.println(country.substring(11, 31));
			System.out.println(country.substring(20, 38));
			System.out.println(place.concat(country));
			System.out.println(place + country);
			System.out.println("Europe " +country); 
			System.out.println(place +" "+country);
			
			if (place.startsWith("europe")) {
			 System.out.println("true:");
			} 
			else {
				System.out.println("false:");
			}
			if (country.endsWith("Europe")) {
				System.out.println("perfect");
				
			}else {
				System.out.println("not perfect");
			}

     
		

		
		
		
		
	}

}
