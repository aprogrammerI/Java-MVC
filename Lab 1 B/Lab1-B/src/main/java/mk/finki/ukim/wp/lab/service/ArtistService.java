package mk.finki.ukim.wp.lab.service;

import mk.finki.ukim.wp.lab.model.Artist;

import java.util.List;
import java.util.Optional;

public interface ArtistService
{
    List<Artist> listArtists();
    Optional ArtistfindById(Long id);
}
