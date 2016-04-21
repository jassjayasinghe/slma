package jas.el.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public ModelAndView loginView() {
		ModelAndView loginMAV=new ModelAndView("login");
		loginMAV.addObject("message", "Login Here");
		return loginMAV;
	}
	
	@RequestMapping(value = "/success/{userName}/{age}")
	public ModelAndView loginSuccess(@PathVariable("userName") String name,@PathVariable("age") String age) {
		ModelAndView loginMAV=new ModelAndView("success");
		loginMAV.addObject("msg", "Success "+name+" "+age);
		return loginMAV;
	}
	
	@RequestMapping(value="/loginValidation", method=RequestMethod.POST)
	public ModelAndView submitLoginForm(@PathVariable("un") String userName,@PathVariable("pw") String password){
		ModelAndView loginMAV=new ModelAndView("success");
		loginMAV.addObject("msg", "Success "+userName+" "+password);
		return loginMAV;
	}
	
	@RequestMapping(value = "/fail")
	public ModelAndView loginFail() {
		ModelAndView loginMAV=new ModelAndView("login");
		loginMAV.addObject("message", "Fail");
		return loginMAV;
	}
	
	@RequestMapping(value="/registration/{email}/{pw}/{ans}")
	public ModelAndView testMultiple(@PathVariable Map<String,String> map){
		String name=map.get("email");
		String pw=map.get("pw");
		String ans=map.get("ans");
		ModelAndView loginMAV=new ModelAndView("login");
		loginMAV.addObject("name", "Success "+name+" "+pw+" "+ans);
		return loginMAV;
	}
}
