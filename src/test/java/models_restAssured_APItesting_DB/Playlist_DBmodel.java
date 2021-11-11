package models_restAssured_APItesting_DB;

public class Playlist_DBmodel {
    private int id;
    private int user_id;
    private String name;

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public Playlist_DBmodel(int id, int user_id, String name) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
    }
}
