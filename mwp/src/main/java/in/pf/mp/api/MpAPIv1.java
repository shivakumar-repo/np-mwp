package in.pf.mp.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RestController
@RequestMapping("/api/v1")
public class MpAPIv1 {
	
	@GetMapping("/")
	public String defaultR() {
		return "Welocme to MWP.";
	}
	
	@GetMapping("r1")
	public String r1() {
		String r1 = String.valueOf(UUID.randomUUID());
		return "MWP Resource : "+r1;
	}
	
	@GetMapping("r2")
	@Produces(MediaType.APPLICATION_JSON)
	public MyData r2(@RequestParam(defaultValue = "null") String reqID) {
		String r2 = String.valueOf(UUID.randomUUID());
		return new MyData("mwp", r2, reqID);
	}

}
