package lesson10_11_Inheritance_Super_NameConventions;

public final class Student extends Person { //final class is not allowed to be inharite
    private String major;
    private String schoolName;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, String lastName, int yearOfBirth, String major, String schoolName) {
        super(name, lastName, yearOfBirth);
        this.major = major;
        this.schoolName = schoolName;
    }
}
