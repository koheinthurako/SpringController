package com.demoController.ControllerDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demoController.ControllerDemo.entities.Student;
import com.demoController.ControllerDemo.service_impl.Student_Service_Impl;

@RestController
//	@RestController = @Controller + @ResponseBody
//	@RestController က frontEnd & backEnd ကို ကြားထဲကလှမ်းချိတ်ပေးဖို့ spring က ရေးပေးထားတဲ့ feature ဖြစ်တယ်
//	သူကအောက်က sentMsg() ကိုလှမ်းခေါ်လိုက်တာနဲ့ Server ကနေ Browser မှာ return ပြန်ထားတာကို လှမ်းပြပေးနိုင်တယ်
//	လှမ်းခေါ်တဲ့နည်းလမ်းကတော့ အောက်က @RequestMapping နဲ့ခေါ်တယ် () parameter ထဲက value မှာ ကိုယ်စားပြုနာမည်ကိုထည့်ပေးရတယ်
//	method မှာ အောက်ကလို ဘာမှမထည့်ရင်တော့ default က ReqeustMethod.GET အနေနဲ့အလုပ်လုပ်တယ်
@RequestMapping("/std")
//	@RequestMapping က Server ဘက်က data ကို client ဘက် (Browser) ကို လှမ်းပို့ခြင်း သူ့ကို class, method level မှာသုံးလို့ရတယ်
public class StudentController {
	
	@Autowired
	Student_Service_Impl stdService;
	
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
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> stds = stdService.getAll();
		return new ResponseEntity<List<Student>>(stds, HttpStatus.OK);
	}
	
	@PostMapping("/msg/{hello}")
	public void reveiveMsg(@PathVariable("hello") String msg) {
		System.out.println("Received msg + " + msg);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStd(@RequestBody Student std) {
		Student newStd = stdService.save(std);
		return new ResponseEntity<Student>(newStd, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStd(@PathVariable int id) {
		return stdService.delete(id);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStd(@PathVariable int id, @RequestBody Student std) {
		Student updateStd = stdService.update(id, std);
		return new ResponseEntity<Student>(updateStd, HttpStatus.OK);
	}

}
