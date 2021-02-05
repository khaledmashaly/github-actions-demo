package com.example.githubactionstutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class GithubActionsTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsTutorialApplication.class, args);
	}

}

@RestController
@RequestMapping("/")
class HomeController {
	@GetMapping
	public String getHome() {
		return "Hello, Khaled!";
	}
}