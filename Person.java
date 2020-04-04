import java.util.HashMap;

public class Person {
    public String name;
    public String birthday;
    public SexType sex;
    public HashMap<Person,String> relatives;
    public String uniId;

    public HashMap<Person,String> defaultRelatives = new HashMap<Person,String>();
    
    public Person(String name, String birthday, SexType sex, HashMap<Person,String> relatives, String uniId) {
        this.name = name != null ? name : "Anonymous";
        this.birthday = birthday != null ? birthday : "N/A";
        this.sex = sex != null ? sex : SexType.NotSpecified;
        this.relatives = relatives != null ? relatives : defaultRelatives;
        this.uniId = uniId;
    }
    
    public void addRelative(Person person, String relation) {
        this.relatives.put(person, relation);
    }
}