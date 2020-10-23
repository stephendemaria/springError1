package controllers;
//import org.springframework.beans.factory.annotation.Autowired;
import services.SourceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import org.springframework.ui.Model;
import services.SourceServiceImpl;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class MainController
{

    private final SourceService sService = new SourceServiceImpl();

    public MainController( SourceService ss )
    {

        //this.sService = ss;

    }

    @RequestMapping( "/" )
    public ModelAndView index(HttpServletResponse response, ModelAndView mv )
    {

        // test 1
        //model.addAttribute( "source", sService.getSourceModel() );
        //model.addAttribute( "source", sService.getSourceModel().getAuthorFirstName() );

        //System.out.println( "test output" );
        log.debug( "test" );
        log.debug( sService.toString() );

        // test 2
        mv = new ModelAndView();
        mv.setViewName( "index" );
        mv.addObject( "source", sService.getSourceModel() );

        return mv;

    }

}
