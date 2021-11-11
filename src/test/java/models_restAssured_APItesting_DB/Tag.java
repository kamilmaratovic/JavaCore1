package models_restAssured_APItesting_DB;

public class Tag {
    private String name;
    private long id;


    public Tag(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
