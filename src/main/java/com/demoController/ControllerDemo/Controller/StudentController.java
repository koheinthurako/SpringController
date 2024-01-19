package com.demoController.ControllerDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//	@RestController = @Controller + @ResponseBody
//	@RestController က frontEnd & backEnd ကို ကြားထဲကလှမ်းချိတ်ပေးဖို့ spring က ရေးပေးထားတဲ့ feature ဖြစ်တယ်
//	သူကအောက်က sentMsg() ကိုလှမ်းခေါ်လိုက်တာနဲ့ Server ကနေ Browser မှာ return ပြန်ထားတာကို လှမ်းပြပေးနိုင်တယ်
//	လှမ်းခေါ်တဲ့နည်းလမ်းကတော့ အောက်က @RequestMapping နဲ့ခေါ်တယ် () parameter ထဲက value မှာ ကိုယ်စားပြုနာမည်ကိုထည့်ပေးရတယ်
//	method မှာ အောက်ကလို ဘာမှမထည့်ရင်တော့ default က ReqeustMethod.GET အနေနဲ့အလုပ်လုပ်တယ်
@RequestMapping("/std")
//	@RequestMapping က Server ဘက်က data ကို client ဘက် (Browser) ကို လှမ်းပို့ခြင်း သူ့ကို class, method level မှာသုံးလို့ရတယ်
public class StudentController {
	
//	server ဘက်ကနေ client ကိုပို့ရင် GET method()
	@RequestMapping(value="", method=RequestMethod.GET)
	public String sentMsg() {
		return "This is home page";
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sentMsg2() {
		return "Hello Student";
	}
	
//	@GetMapping က အပေါ်ကရေးထားတဲ့ RequestMapping ပုံစံအလုပ်လုပ်တာနဲ့ အတူတူပဲ
//	နောက်ပိုင်းမှာတော့ @GetMapping ကိုပဲ အသုံးများတယ်
	@GetMapping("/mgp")
	public String sentMsg3() {
		return "Mingalarpar";
	}

}
