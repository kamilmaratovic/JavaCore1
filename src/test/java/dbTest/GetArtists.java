package dbTest;

import org.testng.annotations.Test;
import z_helpers.DbAdapter;

public class GetArtists {
    @Test
    public void getAllArtists(){
        var list = DbAdapter.getAllArtists();

        for (var artist : list){
            System.out.println(artist.getId()+" "+artist.getName()+" "+artist.getImage());
        }
    }
}
