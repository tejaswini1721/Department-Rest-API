

package springboot.project.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/emp")
	public String helloworld() {
		return "This my page";
		
	}
 
}
