package com.codeup.codeupspringblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {


    @RequestMapping(path = "/add/{firstNum}/and/{secondNum}", method = RequestMethod.GET)
    @ResponseBody
    public String addNum(@PathVariable int firstNum, @PathVariable int secondNum) {

        return "<h1>" + (firstNum + secondNum) + "</h1>";


    }


    @GetMapping("/subtract/{firstNum}/from/{secondNum}")
    @ResponseBody

    public String subtractNum(@PathVariable int firstNum, @PathVariable int secondNum) {

        return "<p>" + (firstNum - secondNum) + "</p>";


    }


    @GetMapping("/multiply/{firstNum}/and/{secondNum}")
    @ResponseBody

    public String multiplyNum(@PathVariable int firstNum, @PathVariable int secondNum) {

        return "<p>" + (firstNum * secondNum) + "</p>";


    }


    @GetMapping("/divide/{firstNum}/by/{secondNum}")
    @ResponseBody

    public String divideNum(@PathVariable int firstNum, @PathVariable int secondNum) {

        return "<p>" + (firstNum / secondNum) + "</p>";


    }


}
