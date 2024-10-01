package ie.atu.week3cicd1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class Week3 {
    @GetMapping("/message")
    public String getMessage(){ return "Some message"; }

    @GetMapping("/details")
    public String getDetails(){ return "Some other message"; }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Greetings, " + name;
    }
}
