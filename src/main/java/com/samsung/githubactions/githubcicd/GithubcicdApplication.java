package com.samsung.githubactions.githubcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubcicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubcicdApplication.class, args);
	}

//	git init
//  git status
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/sirisha-k/ForPresentationOfGITHUBACTIONSCICD.git
//	git push -u origin main
//
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to my home page";
	}

}
