package com.codeup.codeupspringblog.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
public class RollDice {


    @GetMapping("/roll-dice")

    public String showDiceForm() {

        return "roll-dice";


    }


    @GetMapping("/roll-dice/{n}")

    public String showResults(Model model, @PathVariable int n) {

        int random = new Random().nextInt(7);

        if (n == random) {

            model.addAttribute("correct", true);


        } else {

            model.addAttribute("incorrect", true);


        }

        System.out.println(random);


        return "show-results";


    }


}


