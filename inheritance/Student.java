package MyPackage.OOP3.inheritance;

public class Student extends Person {
    int StudentId;
    public Student(){}
    public Student(String name , String family , int age , int studentid){
        super(name, family, age);
        StudentId=studentid;
    }
    public void Print(){System.out.println("Student ID: " + StudentId);}
    public int getStudentId() {
        return this.StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }
}


