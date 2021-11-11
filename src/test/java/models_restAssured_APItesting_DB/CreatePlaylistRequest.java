package models_restAssured_APItesting_DB;

public class CreatePlaylistRequest {
    private String name;
    private String[] rules;

    public CreatePlaylistRequest(String name) {
        this.name = name;
    }
}
