package mk.finki.ukim.wp.lab.repository;

import mk.finki.ukim.wp.lab.bootstrap.DataHolder;
import mk.finki.ukim.wp.lab.model.Artist;
import mk.finki.ukim.wp.lab.model.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SongRepository
{
    public List<Song> findAll()
    {
        return DataHolder.songs;
    }

    public Song findByTrackId(Long id)
    {

        return DataHolder.songs.stream().filter(i->i.getId().equals(id)).findFirst().get();
    }

    public Artist addArtistToSong(Artist artist, Song song)
    {
        if(artist != null && song != null)
        {
            song.getPerformers().add(artist);
        }

        return artist;
    }

    public Song deleteById(Long id)
    {
        Song song = findByTrackId(id);
        DataHolder.songs.remove(song);

        return song;
    }
}
