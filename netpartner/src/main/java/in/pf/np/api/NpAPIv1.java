package in.pf.np.api;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class NpAPIv1 {
	
	@Value("${data.api.mwp.url}")
    private String mwpUrl;
	
	
	@GetMapping("/")
	public String defaultR() {
		return "Welocme to Netpartner.";
	}
	
	@GetMapping("r1")
	public String r1() {
		String r1 = String.valueOf(UUID.randomUUID());
		return "Netpartner Resource : "+r1;
	}
	
	@GetMapping("r2")
	public String r2() {
		RestTemplate restTemplate = new RestTemplate();
		String p1 = String.valueOf(UUID.randomUUID()).replaceAll("-", "").toUpperCase();
		String response = restTemplate.getForObject(mwpUrl+"/api/v1/r2?reqID="+p1, String.class);
		return response;
	}

}
