import java.util.Calendar;

public class JUnit {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;
    private String fullName;
    private String formalName;
    private int getAge;
    Calendar calendar = Calendar.getInstance();

    public JUnit(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
        this.fullName = fullName;
        this.formalName = formalName;
        this.getAge = getAge;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFormalName(String formalName) {
        this.formalName = formalName;
    }

    public void setGetAge(int getAge) {
        this.getAge = getAge;
    }

    public String fullName(){
        return firstName + " " + lastName;
    }

    public String formalName(){
        return title + " " + fullName();
    }

    public int getAge(){
        return 2024 - YOB;
    }

    public int getAge(int year){
        calendar.set(Calendar.YEAR, year);
        return calendar.get(Calendar.YEAR);
    }


}
