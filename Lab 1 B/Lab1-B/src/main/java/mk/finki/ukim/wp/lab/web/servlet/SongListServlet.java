package mk.finki.ukim.wp.lab.web.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mk.finki.ukim.wp.lab.service.SongService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.web.IWebExchange;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

import java.io.IOException;

@WebServlet(urlPatterns = "/listSongs")
public class SongListServlet extends HttpServlet
{
    private  final SongService songService;
    private final SpringTemplateEngine springTemplateEngine;

    public SongListServlet(SongService songService, SpringTemplateEngine springTemplateEngine)
    {
        this.songService = songService;
        this.springTemplateEngine = springTemplateEngine;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {

        String selectedSongId = "1";

        IWebExchange webExchange = JakartaServletWebApplication
                .buildApplication(getServletContext())
                        .buildExchange(req,resp);

        WebContext webContext = new WebContext(webExchange);

        webContext.setVariable("songs",songService.listSongs());
        webContext.setVariable("selectedSongId",selectedSongId);

//        super.doGet(req, resp);

        springTemplateEngine.process("listSongs.html",webContext,resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
//        super.doPost(req, resp);

        String selectedSongId = req.getParameter("selectedSongId");


        resp.sendRedirect("/artists?selectedSongId=" + selectedSongId);
    }
}
