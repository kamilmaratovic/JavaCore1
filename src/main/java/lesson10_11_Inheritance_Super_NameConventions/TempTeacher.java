package lesson10_11_Inheritance_Super_NameConventions;

public class TempTeacher extends Teacher{
    private String monthOfWork;

    public String getMonthOfWork() {
        return monthOfWork;
    }

    public void setMonthOfWork(String monthOfWork) {
        this.monthOfWork = monthOfWork;
    }

    public TempTeacher(String name, String lastName, int yearOfBirth, String subject, String monthOfWork) {
        super(name, lastName, yearOfBirth, subject);
        this.monthOfWork = monthOfWork;
    }
}
