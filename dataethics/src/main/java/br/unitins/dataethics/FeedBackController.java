package br.unitins.dataethics;

import br.unitins.dataethics.data.FeedbackRepository;
import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FeedBackController {
    @Autowired
    private FeedbackRepository repository;

    @GetMapping("/")
    @ResponseBody
    public ModelAndView feedback(){
        return new ModelAndView("hello.html");
    }
}
