package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@RequestMapping("/")
	public String hello() {
		return "Hello Worl2!";
	}

  @RequestMapping("/hello1")
  public String hello2() {
    return "Hello Worl2!";
  }

}
