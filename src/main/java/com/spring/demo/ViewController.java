package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/view")
public class ViewController {
	
	
	@GetMapping("/manisha")
	public String manisha()
	{
	
		return "this is normal API created just for demo purpose";
	}

}
