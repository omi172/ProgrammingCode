package Assignment4.Question2;

public class CheckAge {
    private int voterAge;
    public CheckAge(int voterAge){
        this.voterAge = voterAge;
    }
    public void check() throws InvalidAgeForVoterException {
        if(voterAge > 15 && voterAge < 21) {
            System.out.println("Age Is Valid");
        }else{
            throw new InvalidAgeForVoterException("Age is not within range");
        }
    }
}
