package Assignment4.Question3;

public class checkDays {
    private int day;
    public checkDays(int day){
           this.day = day;
    }

    public void check() throws InvalidUserInputException{
        if(day < 0 || day > 6){
            throw new InvalidUserInputException("Invalid Number Entered");
        }
    }

}
