package com.Mex;

import com.Mex.model.Artist;
import com.Mex.model.Datasource;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()){
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_ASC);
        if(artists == null){
            System.out.println("no artists in the list");
            return;
        }
        for(Artist artist : artists){
            System.out.println("ID : " + artist.getId() + " Name : " + artist.getName());
        }

//        List<String> albumsForArtists = datasource.queryAlbumsForArtists("Pink Floyd", Datasource.ORDER_BY_ASC);
//        for(String album : albumsForArtists){
//            System.out.println(album);
//        }





        datasource.close();
    }
}
