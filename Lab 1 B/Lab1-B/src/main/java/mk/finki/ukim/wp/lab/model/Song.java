package mk.finki.ukim.wp.lab.model;

import lombok.Data;
import jakarta.persistence.*;



import java.util.ArrayList;
import java.util.List;


@Data

public class Song
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String trackId;
    String title;
    String genre;
    int releaseYear;
    List<Artist> performers;
    private Album album;


    public Song(  String title, String genre, int releaseYear, List<Artist> performers,Album album) {


        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.performers = performers != null ? performers : new ArrayList<>();
        this.album = album;
    }


//    public String getTrackId()
//    {
//        return trackId;
//    }


    public Long getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }
    public List<Artist> getPerformers()
    {
        return performers;
    }

    public Album getAlbum() {
        return album;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
