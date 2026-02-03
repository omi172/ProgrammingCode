package Assignment4.Question1;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;
    Student(int rollNo, String name, int age, String course){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
