package com.Mex;

import com.Mex.model.Artist;
import com.Mex.model.Datasource;
import com.Mex.model.SongArtist;

import java.util.List;
import java.util.Scanner;

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

        List<String> albumsForArtists = datasource.queryAlbumsForArtists("Pink Floyd", Datasource.ORDER_BY_ASC);
        for(String album : albumsForArtists){
            System.out.println(album);
        }


        List<SongArtist> songArtists = datasource.queryArtistForSong("Stormbringer", Datasource.ORDER_BY_ASC);
        if(songArtists == null){
            System.out.println("no artist for the song");
            return;
        }
        for (SongArtist artist : songArtists){
            System.out.println("Name: " + artist.getArtistName() +
            " Album: " + artist.getAlbumName() +
            " Track: " + artist.getTrack());
        }



        datasource.querySongsMetaData();

        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println("Number of songs " + count);

        datasource.createViewForSongArtists();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter song title: ");
//        String title = scanner.nextLine();
//
//        songArtists = datasource.querySongInfoView(title);
//        if(songArtists.isEmpty()){
//            System.out.println("no artist for given song");
//            return;
//        }
//        for(SongArtist artist : songArtists){
//            System.out.println("VIEW: Artist name: " + artist.getArtistName() + " Album: " + artist.getAlbumName() +
//            " Track: " + artist.getTrack());
//        }



        datasource.insertSong("Bombtrack", "RATM", "Rage Against the Machine", 1);

        datasource.close();
    }
}
