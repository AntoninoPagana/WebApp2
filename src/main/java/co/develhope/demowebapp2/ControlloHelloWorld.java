package co.develhope.demowebapp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ControlloHelloWorld {
    @GetMapping("/ciao")
    public String saluta(){
        return "Hello World";
    }
}
