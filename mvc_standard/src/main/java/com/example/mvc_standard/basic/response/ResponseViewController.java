package com.example.mvc_standard.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @GetMapping("/response-view-v1")
    public ModelAndView responseView1(){
        ModelAndView mav = new ModelAndView("response/hello").addObject("data", "hello!");

        return mav;
    }

//    권장
    @GetMapping("/response-view-v2")
    public String responseView2(Model model){
        model.addAttribute("data", "hello!");
        return "response/hello";
    }

//   명시성이 너무 떨어져서 권장X
    @GetMapping("/response/hello")
    public void responseView3(Model model){
        model.addAttribute("data","helloV3");
    }
}
