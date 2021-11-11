package z_helpers;

import models_restAssured_APItesting_DB.Artist_DBmodel;
import models_restAssured_APItesting_DB.CustomPlaylist_DBmodel;
import models_restAssured_APItesting_DB.Playlist_DBmodel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbAdapter {
//    public static List<Playlist_DBmodel> getPlaylistByUserId(int userId) {
public static List<CustomPlaylist_DBmodel> getPlaylistById(int playlistId) {
        List<CustomPlaylist_DBmodel> songs = new ArrayList<>();
//        List<Playlist_DBmodel> playlistList = new ArrayList<>();
        final String USERNAME = "dbuser06";
        final String PASSWORD = "pa$$06";
        final String URL = "jdbc:mariadb://104.237.13.60/dbkoel";
        final String DRIVER = "org.mariadb.jdbc.Driver";
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName(DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(
                    URL, USERNAME, PASSWORD);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();

//            String sql = "SELECT * FROM playlists p WHERE user_id =" + userId;
            String sql = "SELECT s.track, s.title, a.name, a2.name, s.length "+
            "FROM songs s "+
            "JOIN artists a on a.id =s.artist_id "+
            "JOIN albums a2 on a2.id =s.album_id "+
            "JOIN playlist_song ps on ps.song_id = s.id "+
            "WHERE ps.playlist_id = "+playlistId;

            var result = stmt.executeQuery(sql);
            while (result.next()) {
//                int id = result.getInt("id");
//                int user_id = result.getInt("user_id");
//                String name = result.getString("name");
                var song = new CustomPlaylist_DBmodel(result.getInt("track"), result.getString("title"), result.getString("name"));
                songs.add(song);
            }

        } catch (SQLException | ClassNotFoundException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
        return songs;
        //end main
    }

    public static List<Artist_DBmodel> getAllArtists() {
        List<Artist_DBmodel> artists = new ArrayList<>();
        final String USERNAME = "dbuser06";
        final String PASSWORD = "pa$$06";
        final String URL = "jdbc:mariadb://104.237.13.60/dbkoel";
        final String DRIVER = "org.mariadb.jdbc.Driver";
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName(DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(
                    URL, USERNAME, PASSWORD);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();

//            String sql = "SELECT * FROM playlists p WHERE user_id =" + userId;
            String sql = "SELECT * FROM artists a";

            var result = stmt.executeQuery(sql);
            while (result.next()) {
//                int id = result.getInt("id");
//                int user_id = result.getInt("user_id");
//                String name = result.getString("name");
                var artist = new Artist_DBmodel(result.getInt("id"), result.getString("name"), result.getString("image"));
                artists.add(artist);
            }

        } catch (SQLException | ClassNotFoundException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
        return artists;
        //end main
    }

    public static Playlist_DBmodel getPlaylistById1(int playlistId) {
        Playlist_DBmodel playlist = null;
        final String USERNAME = "dbuser06";
        final String PASSWORD = "pa$$06";
        final String URL = "jdbc:mariadb://104.237.13.60/dbkoel";
        final String DRIVER = "org.mariadb.jdbc.Driver";

        Connection connection = null;
        Statement statement = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName(DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query
            System.out.println("Creating table in given database...");
            statement = connection.createStatement();

            String sql = "SELECT * from playlists p where id = " + playlistId;

            var result = statement.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("id");
                int user_id = result.getInt("user_id");
                String name = result.getString("name");

                playlist = new Playlist_DBmodel(id, user_id, name);
            }

        } catch (SQLException | ClassNotFoundException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (statement != null) {
                    connection.close();
                }
            } catch (SQLException ignored) {
            }// do nothing
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
        return playlist;
    }//end main
}


