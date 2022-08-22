package MyPackage.OOP3.inheritance;

public class Person {
    String name;
    String family;
    int age;
    public Person(){}
    public Person(String Name, String Family, int Age) {
        name = Name;
        family = Family;
        age = Age;
    }
    public void PrintPersoninfo(){
        System.out.println("Name : " + name+"\tFamily : " + family+"\tAge : " + age);

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return this.family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
