package models_restAssured_APItesting_DB;

public class CustomPlaylist_DBmodel {
    private int track;
    private String title;
    private String name;
    private String albumName;
    private double length;

    public CustomPlaylist_DBmodel(int track, String title, String name) {
        this.track = track;
        this.title = title;
        this.name = name;
    }

    public int getTrack() {
        return track;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getAlbumName() {
        return albumName;
    }

    public double getLength() {
        return length;
    }

    public CustomPlaylist_DBmodel(int track, String title, String artistName, String albumName, double length) {
        this.track = track;
        this.title = title;
        this.name = artistName;
        this.albumName = albumName;
        this.length = length;
    }
}
