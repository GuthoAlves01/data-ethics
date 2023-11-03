package br.unitins.dataethics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedBackController {
    @GetMapping("/")
    public String feedback(){
        return "hello word!";
    }
}
