package day4_BTVN_Employee;

public class Developer {

	public static void main(String[] args) {
		
		Employee eml1 = new Employee();
		eml1.setEmployee_id(1);
		eml1.setEmployee_name("Linh");
		eml1.setEmployee_salary(15000000);
		System.out.println(eml1.getEmployee_id()+"," +eml1.getEmployee_name()+"," +eml1.getEmployee_salary());

		Employee eml2 = new Employee();
		eml2.setEmployee_id(2);
		eml2.setEmployee_name("An");
		eml2.setEmployee_salary(20000000);
		System.out.println(eml2.getEmployee_id()+"," +eml2.getEmployee_name()+"," +eml2.getEmployee_salary());

	}
	
}
