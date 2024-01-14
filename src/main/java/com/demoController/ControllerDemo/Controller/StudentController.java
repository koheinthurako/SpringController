package com.demoController.ControllerDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
//@RequestMapping က Server ဘက်က data ကို client ဘက် (Browser) ကို လှမ်းပို့ခြင်း သူ့ကို class, method level မှာသုံးလို့ရတယ်
public class StudentController {
	
//	server ဘက်ကနေ client ကိုပို့ရင် GET method()
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String sentMsg() {
		return "This is home page";
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sentMsg2() {
		return "Hello Student";
	}
	
//	@GetMapping က အပေါ်ကရေးထားတဲ့ RequestMapping ပုံစံအလုပ်လုပ်တာနဲ့ အတူတူပဲ
	@GetMapping("/mgp")
	public String sentMsg3() {
		return "Mingalarpar";
	}

}
