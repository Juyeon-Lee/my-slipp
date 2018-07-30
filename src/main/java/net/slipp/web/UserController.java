package net.slipp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	private List<User> Users = new ArrayList<User>();
	
	@PostMapping("/create") //GetMapping은 서버전달 할 때 password도 노출이 된다
	public String create(User user) { // method의 인자가 너무 많아짐을 대비해서 새로운 User class를 만든다.
		System.out.println("user : "+user);
		Users.add(user);
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("users", Users);
		return "list";
	}
}
