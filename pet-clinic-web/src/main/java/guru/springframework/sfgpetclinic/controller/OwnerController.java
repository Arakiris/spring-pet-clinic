package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @GetMapping({"", "/", "/index", "index.php"})
    public String listOwners(){
        return "owners/index";
    }

}
