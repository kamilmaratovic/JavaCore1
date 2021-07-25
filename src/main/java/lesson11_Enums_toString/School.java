package lesson11_Enums_toString;

public class School {
    private String name;
    private SchoolType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SchoolType getType() {
        return type;
    }

    public void setType(SchoolType type) {
        this.type = type;
    }

    public School(String name, SchoolType type) {
        this.name = name;
        this.type = type;
    }

}
