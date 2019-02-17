package ir.etefaghian.sfgpetclinic.controllers;


import ir.etefaghian.sfgpetclinic.services.VetSrvice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController
{

    private  final VetSrvice vetSrvice ;

    public VetController(VetSrvice vetSrvice) {
        this.vetSrvice = vetSrvice;
    }


    @RequestMapping({"/vets","/vets/index","/vets/index.html"})

    public String listVets(Model model)
    {
        model.addAttribute("vets",vetSrvice.findAll());
        return "vets/index";
    }

}
