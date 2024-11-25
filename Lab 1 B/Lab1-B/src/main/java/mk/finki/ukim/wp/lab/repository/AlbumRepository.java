package mk.finki.ukim.wp.lab.repository;

import mk.finki.ukim.wp.lab.bootstrap.DataHolder;
import mk.finki.ukim.wp.lab.model.Album;

import java.util.List;

public class  AlbumRepository
{
    public List<Album> findAll()
    {
        return DataHolder.albums;
    }
}
