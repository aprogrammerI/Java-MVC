package mk.finki.ukim.wp.lab.service.impl;

import mk.finki.ukim.wp.lab.model.Artist;
import mk.finki.ukim.wp.lab.model.Song;
import mk.finki.ukim.wp.lab.repository.ArtistRepository;
import mk.finki.ukim.wp.lab.repository.SongRepository;
import mk.finki.ukim.wp.lab.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService
{
    private final SongRepository songRepository;
    private final ArtistRepository artistRepository;

    public SongServiceImpl(SongRepository songRepository, ArtistRepository artistRepository)
    {
        this.songRepository = songRepository;
        this.artistRepository = artistRepository;
    }


    @Override
    public List<Song> listSongs()
    {
        return this.songRepository.findAll();
    }

    @Override
    public Artist addArtistToSong(Artist artist, Song song)
    {


        return this.songRepository.addArtistToSong(artist,song);

    }

    @Override
    public Song findByTrackId(String trackId) {
        return null;
    }

    @Override
    public Song deleteById(String id) {
        return null;
    }


}
