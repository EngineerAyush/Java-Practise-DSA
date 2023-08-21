public class OOPS {
public static void main(String[] args) {
    Student s1=new Student();
    s1.name="Abhay";
    s1.age=20;
    s1.pass="123";
    s1.marks[0]=12;
    s1.marks[1]=90;
    s1.marks[2]=110;
    Student s2=new Student(s1);
    s2.marks[1]=250;
    for (int i = 0; i < 3; i++) {
        System.out.println(s2.marks[i]);
    }
}};
class Student{
    String name;
    int age;
    String pass;
    int marks[];
    Student(Student s1) {
        marks=new int[3]; 
    this.name=s1.name;
    this.age=s1.age;
    this.marks=s1.marks;
    
    }
    Student(){
        marks=new int[3]; 
        // this.name=name; Will insitialize above name with the name passed as parameter

        System.out.println("Constructor Is Called...");
    }
}
    