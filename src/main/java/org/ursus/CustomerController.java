package org.ursus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    public static final Logger LOG = LoggerFactory.getLogger(CustomerController.class.getName());

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping(value = "/showForm")
    public String showForm(Model model){
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping(value = "/processForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer customer,
            BindingResult bindingResult){
        LOG.info("last name: |{}|", customer.getLastName());
        if(bindingResult.hasErrors())
            return "customer-form";
        else
            return "customer-confirmation";
    }
}
