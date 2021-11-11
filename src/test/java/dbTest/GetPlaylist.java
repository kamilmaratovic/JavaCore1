package dbTest;

import org.testng.annotations.Test;
import z_helpers.DbAdapter;

public class GetPlaylist {
    @Test
    public void getPlaylistForUser(){
       var list= DbAdapter.getPlaylistById(7394);
//       for (int i = 0; i<list.size(); i++) {
//           System.out.println(i+1+". "+ list.get(i).getTitle());
//       }
       for(var pl: list){
           System.out.println(pl.getTrack()+" / "+pl.getTitle()+" / "+pl.getName());
//       }

    }}}

