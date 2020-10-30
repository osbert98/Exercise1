package exercise1;

public class MainResume {

	public static void main(String[] args) {
		

		System.out.println("My Resume\n");
		
		Biodata b = new Biodata();
		Result r = new Result();
		workExp w = new workExp();
		workSkills s = new workSkills();
		Talents t = new Talents();
		CGPA c = new CGPA();
		
		
		
		
		b.printBiodata();
		r.printResult();
		w.printworkExp();
		s.printworkSkills();
		t.printTalents();
		c.printGPA();
		 
		System.out.println("Final CGPA: "+c.calculateCGPA());
	}
	
}
