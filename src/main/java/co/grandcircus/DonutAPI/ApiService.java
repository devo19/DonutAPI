package co.grandcircus.DonutAPI;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {
	
private RestTemplate restTemplate;
	
	// This is an instance initialization block. It runs when a new instance of the class is created--
	// right before the constructor.
	{
	    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public DonutApiResponse getDonuts() {
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		
		DonutApiResponse response = restTemplate.getForObject(url, DonutApiResponse.class);
		return response;
	}
	
	public DonutDetail getById(Long id){
		String url = "https://grandcircusco.github.io/demo-apis/donuts/"+id+".json";
		
		DonutDetail response = restTemplate.getForObject(url, DonutDetail.class);
		return response;
	}
	
	
	
	
	
	

}
