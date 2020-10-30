package exercise1;

public class Biodata {

	String name = "OSBERT HOWELL MOIZIN";
	String gender = "Male";
	String birthday = "28 July 1998";
	int age = 22;
	String citizenship = "Malaysian";
	String marital_status = "Single";
	String address = "Kampung Soronsob 89108 Kota Marudu, Sabah, Malaysia.";
	String hp = "016-8354737";
	
		public void printBiodata(){
			
			System.out.println("Name: "+name);
			System.out.println("Gender: "+gender);
			System.out.println("Date of Birth: "+birthday);
			System.out.println("Age: "+age);
			System.out.println("Citizenship: "+citizenship);
			System.out.println("Marital Status: "+marital_status);
			System.out.println("Address: "+address);
			System.out.println("No HP: "+hp);
		}
}
