package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ByController {

    @GetMapping("by")
    public String hello(Model model) {
        model.addAttribute("data", "by spring!");
        return "by";
    }
}
