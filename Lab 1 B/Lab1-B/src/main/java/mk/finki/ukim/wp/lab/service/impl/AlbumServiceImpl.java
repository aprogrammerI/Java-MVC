package mk.finki.ukim.wp.lab.service.impl;

import mk.finki.ukim.wp.lab.model.Album;
import mk.finki.ukim.wp.lab.repository.AlbumRepository;
import mk.finki.ukim.wp.lab.service.AlbumService;

import java.util.List;



public class AlbumServiceImpl implements AlbumService
{

    private final AlbumRepository albumRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository)
    {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findAll()
    {
        return albumRepository.findAll();
    }
}
