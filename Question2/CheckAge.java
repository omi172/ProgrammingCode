package Assignment4.Question2;

public class CheckAge {
    private int studentsAge;
    public CheckAge(int student){
        this.studentsAge = student;
    }
    public void check() throws InvalidAgeForVoterException {
        if(studentsAge < 18) {
            throw new InvalidAgeForVoterException("Not Suitable For Vote");
        }else{
            System.out.println("Valid age for Vote");
        }
    }
}
