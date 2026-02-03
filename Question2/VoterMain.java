package Assignment4.Question2;

public class VoterMain {
    public static void main(String[] args) {
        Voter voter = new Voter(101,"Tukai", 19);
        try {
            CheckAge checkAge = new CheckAge(voter.getAge());
            checkAge.check();
        }catch(InvalidAgeForVoterException  exp){
            System.out.println(exp.getMessage());
        }
    }
}
