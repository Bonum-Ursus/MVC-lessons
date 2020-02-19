package org.ursus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/person")
public class PersonController {

    @RequestMapping(value = "/getPerson")
    public String getPerson(Model model){
        model.addAttribute("person", new Person());
        return "person-form";
    }

    @RequestMapping(value = "/register")
    public String register(@ModelAttribute("person") Person person){
        return "registerForm";
    }
}
