package mk.finki.ukim.wp.lab.service;

import mk.finki.ukim.wp.lab.model.Artist;
import mk.finki.ukim.wp.lab.model.Song;

import java.util.List;

public interface SongService
{
    List<Song> listSongs();
    Artist addArtistToSong(Artist artist, Song song);
    public Song findByTrackId(String trackId);
    public Song deleteById(String id);
}
