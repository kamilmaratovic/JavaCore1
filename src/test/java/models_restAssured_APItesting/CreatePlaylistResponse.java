package models_restAssured_APItesting;

public class CreatePlaylistResponse {
    private int id;
    private String name;
    private String[] rules;
    private boolean is_smart;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
