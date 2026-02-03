package Assignment4.Question1;

import java.util.Locale;

public class CheckName {
    private String studentName;
    public CheckName(String studentName){
        this.studentName = studentName;
    }
    public void check() throws NameNotValidException{
        for(int i = 0 ; i < studentName.length(); i++) {
            char ch = studentName.toLowerCase().charAt(i);
            if (ch <= 'a'  || ch >= 'z') {
                throw new NameNotValidException("Name is not Valid");
            }
        }
        System.out.println(studentName + " is valid");
    }
}
