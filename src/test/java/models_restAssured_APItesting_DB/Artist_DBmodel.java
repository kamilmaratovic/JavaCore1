package models_restAssured_APItesting_DB;

public class Artist_DBmodel {
    private int id;
    private String name;
private String image;

    public Artist_DBmodel(int id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}
