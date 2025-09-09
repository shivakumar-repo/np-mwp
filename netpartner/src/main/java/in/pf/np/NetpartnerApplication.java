package in.pf.np;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class NetpartnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetpartnerApplication.class, args);
	}

	@GetMapping("/")
	public String index(Model model) {            
	    return "redirect: greeting";
	} 
}
