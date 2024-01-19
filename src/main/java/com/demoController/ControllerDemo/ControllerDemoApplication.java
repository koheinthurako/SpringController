package com.demoController.ControllerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//	Spring Controller အကြောင်းစမယ် 
//	resources folder ထဲက application.properties ထဲမှာ ကိုယ် run ချင်တဲ့ server port နဲ့ ချိတ်ချင်တဲ့ library တွေကို သွားရေးရတယ်

@SpringBootApplication
public class ControllerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllerDemoApplication.class, args);
	}

}
