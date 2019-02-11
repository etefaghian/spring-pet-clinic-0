package ir.etefaghian.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {


    @RequestMapping()
    public String listOwner()
    {

        return "owners/index"
    }
}
