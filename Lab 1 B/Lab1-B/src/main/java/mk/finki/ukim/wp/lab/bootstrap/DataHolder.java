package mk.finki.ukim.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.wp.lab.model.Album;
import mk.finki.ukim.wp.lab.model.Artist;
import mk.finki.ukim.wp.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder
{
    public static List<Artist> artists = new ArrayList<>();
    public static List<Song> songs = new ArrayList<>();

    public  static List<Album> albums = new ArrayList<>();

    @PostConstruct
    public void init()
    {

        albums.add(new Album("Album 1","Pop","2016"));
        albums.add(new Album("Album 2","Pop","2017"));
        albums.add(new Album("Album 3","Pop","2018"));
        albums.add(new Album("Album 4","Pop","2019"));
        albums.add(new Album("Album 5","Pop","2020"));



        artists.add(new Artist("Performer1","1","bio1"));
        artists.add(new Artist("Performer2","2","bio2"));
        artists.add(new Artist("Performer3","3","bio3"));
        artists.add(new Artist("Performer4","4","bio4"));
        artists.add(new Artist("Performer5","5","bio5"));
        artists.add(new Artist("Performer6","6","bio6"));
        artists.add(new Artist("Performer7","7","bio7"));


        List<Artist> item1= new ArrayList<>();
        item1.add(artists.get(0));

        List<Artist> item2= new ArrayList<>();
        item2.add(artists.get(1));

        List<Artist> item3= new ArrayList<>();
        item3.add(artists.get(2));

        List<Artist> item4= new ArrayList<>();
        item4.add(artists.get(3));

        List<Artist> item5= new ArrayList<>();
        item5.add(artists.get(4));



        songs.add(new Song("Song1","Pop",2016,item1,albums.get(0)));
        songs.add(new Song("Song2","Rock",2016,item2,albums.get(1)));
        songs.add(new Song("Song3","Disco",2016,item3,albums.get(2)));
        songs.add(new Song("Song4","Electric",2016,item4,albums.get(3)));
        songs.add(new Song("Song5","Pop-Rock",2016,item5,albums.get(4)));

    }
}
