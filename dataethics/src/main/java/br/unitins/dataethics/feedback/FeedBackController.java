package br.unitins.dataethics.feedback;

import br.unitins.dataethics.entity.Feedback;
import br.unitins.dataethics.entity.FeedbackRepository;
import br.unitins.dataethics.service.FeedbackService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller("/")
public class FeedBackController {
    @Autowired
    private FeedbackService service;

    @GetMapping("")
    @ResponseBody
    public RedirectView barraRedirectToIndex(Model model) {
        return new RedirectView("/index");
    }

    @GetMapping("index")
    @ResponseBody
    public ModelAndView index(Model model) {
        return new ModelAndView("index");
    }

    @GetMapping("feedback")
    @ResponseBody
    public ModelAndView requestForm(Feedback feedback, Model model) {
        model.addAttribute("feedback", feedback);
        return new ModelAndView("formulariocontato");
    }

    @PostMapping("feedback/add")
    @ResponseBody
    public RedirectView inserirFeedback(Feedback feedback, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return new RedirectView("/feedback");
        }
        service.salvar(feedback);

        return new RedirectView("/index");
    }
    @GetMapping("quem-somos")
    @ResponseBody
    public ModelAndView quemSomos() {
        return new ModelAndView("quemsomos");
    }

    @GetMapping("code-java")
    @ResponseBody
    public ModelAndView codeJava() {
        return new ModelAndView("codejava");
    }

    @GetMapping("feedback-list")
    @ResponseBody
    public ModelAndView feedback(Model model) {
        model.addAttribute("feedbacks", service.buscarTudo());
        return new ModelAndView("list");
    }




}
