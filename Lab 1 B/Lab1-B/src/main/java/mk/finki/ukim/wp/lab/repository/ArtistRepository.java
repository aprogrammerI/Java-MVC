package mk.finki.ukim.wp.lab.repository;

import mk.finki.ukim.wp.lab.bootstrap.DataHolder;
import mk.finki.ukim.wp.lab.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArtistRepository
{

    public List<Artist> findAll()
    {
        return DataHolder.artists;
    }

    public Optional<Artist> findById(Long id)
    {
        return DataHolder.artists.stream().filter(i->i.getId().equals(id)).findFirst();
    }


}
