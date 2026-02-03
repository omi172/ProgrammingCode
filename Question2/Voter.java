package Assignment4.Question2;

public class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age)  {
        this.age = age;
        this.name = name;
        this.voterId = voterId;
    }

    public int getAge() {
        return age;
    }
}
