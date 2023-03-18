package pl.edu.wszib.http2.service.model;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/kolorki")

public class KolorkiTest {
    enum Kolor {
        CZERWONY,
        NIEBIESKI,
        ZIELONY,
        CZARNY,
        FIOLETOWY,
        ZOLTY

    }


    @GetMapping
    public String test(Model model,@RequestParam(required = false) Kolor kolor ) {
        if(kolor==null) {
            kolor=kolor.CZARNY;
        }
       switch (kolor) {
           case CZERWONY:
               model.addAttribute("kolor", "#ff0000");
               break;
           case ZIELONY:
               model.addAttribute("kolor", "#00ff00");
               break;
           case NIEBIESKI:
               model.addAttribute("kolor", "#0000ff");
               break;
           case CZARNY:
               model.addAttribute("kolor", "#000000");
               break;
           case ZOLTY:
               model.addAttribute("kolor", "#FFD700");
               break;
           case FIOLETOWY:
               model.addAttribute("kolor", "#B803FF");
               break;
       }
        return "kolorki";
    }

}

