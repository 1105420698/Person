import java.util.HashMap;

public class TestPerson {
	public static void main(String[] args) {
		HashMap<Person, String> johnRelationWithJames = new HashMap<Person, String>();

    	Person John = new Person("John", "03/02/1985", SexType.female, null, "John3srd");
		johnRelationWithJames.put(John, "Parent");

   		Person James = new Person("James", "06/22/2009", SexType.male, johnRelationWithJames, "James1st");
    
    	John.addRelative(James, "child");

    	System.out.println(John.name);
    	System.out.println(John.birthday);
    	System.out.println(John.relatives);
    	System.out.println(John.uniId);
  	}
}