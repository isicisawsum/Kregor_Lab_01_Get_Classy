public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID='" + ID + '\'' +
                ", title='" + title + '\'' +
                ", YOB='" + YOB + '\'' +
                '}';
    }

    public String toCSV(){
        return firstName + "," + lastName + "," + ID + "," + title + "," + YOB;
    }

    public String toJSon(){
        return "{'firstName':'" + firstName + "', 'lastName':'" + lastName + "', 'ID':'" + ID + "', 'title':'" + title + "', 'YOB':'" + YOB + "'}";
    }

    public String toXML(){
        return "<person>\n\t <firstName>" + firstName + "</firstName>\n\t <lastName>" + lastName + "</lastName>\n\t<ID>" + ID + "</ID>\n\t<title>" + title + "</title>\n\t<YOB>" + YOB + "</YOB>\n</person>";
    }
}
