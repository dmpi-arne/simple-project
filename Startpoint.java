package oop_2;

public class Startpoint {

	public static void main(String[] args) {
		int a =10;
		Person person1 = new Person();
		
		person1.setFirstName("Md");
		person1.setMiddleName("Bazlur");
		person1.setLastName("Rahman");
		String person1FullName = person1.getFullName();
		
		Person person2= new Person();
		person2.setFirstName("Nazmun");
		person2.setMiddleName("Nahar");
		person2.setLastName("Liza");
		String person2FullName = person2.getFullName();
		
		person2 = person1;
		person1 =null;
		
		
		Person person3 = new Person();
		person3.setFirstName("Ashrafa");
		person3.setMiddleName("Ahmed");
		person3.setLastName("Aurthy");
		String person3FullName = person3.getFullName();
		int num[] = new int [3];
		Person persons[] = new Person[3];
		persons[0] = person1;
		persons [1] = person2;
		persons [2] = person3;
		for(Person aperson : persons) {
			System.out.println(aperson.getFullName());
		}
		

	}

}
