package Assignment4.Question1;

public class CheckAge {
     private int studentsAge;
     public CheckAge(int student){
         this.studentsAge = student;
     }
    public void check() throws AgeNotWithinRangeException{
            if(studentsAge > 15 && studentsAge < 21) {
                System.out.println("Age Is Valid");
            }else{
                throw new AgeNotWithinRangeException("Age is not within range");
            }
    }
}

