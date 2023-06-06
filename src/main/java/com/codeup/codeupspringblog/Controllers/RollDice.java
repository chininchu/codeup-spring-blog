package com.codeup.codeupspringblog.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RollDice {


    @GetMapping("/roll-dice")

    public String showDiceForm(){

        return "roll-dice";




    }

    @PostMapping(/roll)










}
