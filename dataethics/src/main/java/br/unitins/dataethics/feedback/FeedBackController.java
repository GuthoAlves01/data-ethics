package br.unitins.dataethics.feedback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedBackController {
    @GetMapping("/")
    @ResponseBody
    public String feedback(){
        return "index.html";
    }

    @GetMapping("/ajax")
    public String testeajax(String variaval){
        return variaval;
    }
}
