package com.nandan.JavaDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class NewController {
	
	@GetMapping("/std")
	public String responce() {
		return "success";
	}

}
