package MyPackage.OOP3.inheritance;

public class Teacher extends Person{
    int teacherId;
    public Teacher(){}
    public Teacher(String name , String family , int age , int TeacherId){
        super(name, family, age);
        teacherId=TeacherId;
    }
    public void Print(){System.out.println("Teacher ID: " + teacherId);}

    public int getTeacherId() {
        return this.teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

}
