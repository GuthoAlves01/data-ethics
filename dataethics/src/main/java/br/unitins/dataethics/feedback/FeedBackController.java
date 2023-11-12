package br.unitins.dataethics.feedback;

import br.unitins.dataethics.entity.Feedback;
import br.unitins.dataethics.entity.FeedbackRepository;
import org.jeasy.random.EasyRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class FeedBackController {
    @Autowired
    private FeedbackRepository repository;

    @GetMapping("/list")
    @ResponseBody
    public ModelAndView feedback(Model model) {
        model.addAttribute("feedbacks", repository.findAll());
        return new ModelAndView("list");
    }

    @PostMapping("/public/add")
    @ResponseBody
    public RedirectView inserirFeedback(Feedback feedback, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return new RedirectView("index");
        }
        repository.save(feedback);

        return new RedirectView("/list");
    }

    @GetMapping("/public/feedback")
    @ResponseBody
    public ModelAndView requestForm(Feedback feedback, Model model) {
        model.addAttribute("feedback", feedback);
        return new ModelAndView("index");
    }
}
