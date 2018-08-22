import java.util.ArrayList;

public class Runner {

	public static void main(String [] args)
	{
		Person p1 = new Person("Harry", 27, "Wizard");
		Person p2 = new Person("Fluffy", 57, "Guard Dog");
		Person p3 = new Person("Tinkerbell", 209, "Fairy");
		
		System.out.println(p1.getString());
		System.out.println(p2.getString());
		System.out.println(p3.getString());
		
		ArrayList <Person> arrayPeople = new ArrayList<Person> (); 
		arrayPeople.add(p1);
		arrayPeople.add(p2); 
		arrayPeople.add(p3);
		
		for(Person listPerson : arrayPeople)
		{
			System.out.println(listPerson.getString());
		}
		
		for(Person listPerson : arrayPeople)
		{
			if(listPerson.getName() == "Lily")
			{
				System.out.println(listPerson.getString());
			}
			else 
			{
				System.out.println("Dead");
			}
		}
	}
	
//	public static Person searchName(String findName)
//	{
//		for (Person listPerson: arrayPeople
//	}
}
