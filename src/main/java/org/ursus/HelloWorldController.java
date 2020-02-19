package org.ursus;

import com.sun.net.httpserver.HttpServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;

@Controller
@RequestMapping(value = "/form")
public class HelloWorldController {
    @RequestMapping(value = "/inputForm")
    public String getInputForm(){
        return "inputForm";
    }

    @RequestMapping(value = "/outputForm")
    public String getOutputForm(){
        return "outputForm";
    }

    @RequestMapping(value = "/upperCase")
    public String convertToUpperCase(
            @RequestParam("name") String name,
            @RequestParam("lastName") String lastName,
            Model model){
        String message = name.toUpperCase() + " " + lastName.toUpperCase();
        model.addAttribute("message", message.toUpperCase());
        return "outputFormVersionTwo";
    }
}
