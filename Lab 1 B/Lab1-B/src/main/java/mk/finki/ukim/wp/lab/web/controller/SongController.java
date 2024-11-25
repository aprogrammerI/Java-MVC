package mk.finki.ukim.wp.lab.web.controller;


import mk.finki.ukim.wp.lab.repository.SongRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/songs")

public class SongController
{

    final private SongRepository songRepository;


    public SongController(SongRepository songRepository)
    {
        this.songRepository = songRepository;
    }

    @GetMapping()
    public String getSongsPage(@RequestParam(required = false) String error, Model model)
    {

        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }


        model.addAttribute("songs",this.songRepository.findAll());


        return "listSongs";

    }

//    @GetMapping("/songs/add")
//    public String saveSong()
//    {
//
//        return  null;
//    }
//
//    @PostMapping("/songs/add-form")
//    public String getAddSongPage()
//    {
//       return null;
//    }
//
//    @GetMapping("/songs/edit/{songId}")
//    public String editSong(@PathVariable Long songId)
//    {
//      return  null;
//    }
//
//    @PostMapping("/songs/edit-form/{id}")
//    public String getEditSongForm()
//    {
//
//        return null;
//
//    }

    @PostMapping("/delete/{id}")
    public String deleteSong(@PathVariable Long id)
    {
        this.songRepository.deleteById(id);
        return "redirect:/songs";
    }

}
