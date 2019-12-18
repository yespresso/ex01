package com.ICIA.example;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ICIA.example.domain.ProductVO;

@Controller
public class SampleController {
     @RequestMapping("/doA")
     public void doA(){
    	 System.out.println("doA...............");
     }
     
     @RequestMapping("/doB")
     public void doB(){
    	 System.out.println("doB...............");
     }
     
     @RequestMapping("/doC")
     public String doC(@ModelAttribute("msg")String msg){
    	 System.out.println("doC...............");
    	 return "result";
     }
     
     @RequestMapping("/doD")
     public String doD(Model model){
    	 ProductVO vo=new ProductVO("≥√¿Â∞Ì", 1000000);
    	 model.addAttribute("vo",vo);
    	 return "product";
     }
     
     @RequestMapping("/doE")
     public String doE(){
    	 return "redirect:/doD";
     }
     
     @RequestMapping("/doJSON")
     public @ResponseBody ArrayList<ProductVO> doJSON(){
    	 ArrayList<ProductVO> array=new ArrayList<ProductVO>();
    	 
    	 ProductVO vo=new ProductVO("ºº≈π±‚", 500000);
    	 array.add(vo);
    	 
    	 vo=new ProductVO("≥√¿Â∞Ì", 1500000);
    	 array.add(vo);
    	 
    	 return array;
     }
}
