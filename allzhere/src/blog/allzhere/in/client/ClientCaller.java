package blog.allzhere.in.client;

import org.springframework.web.client.RestTemplate;

public class ClientCaller {


	//private static String partUrlStr = "https://bddce-p.app.aexp.com/diapi/";
	private static String partUrlStr = "http://localhost:8888/sanity";
	//private static String partUrlStr = "http://localhost:8080/diapi/";

	public static void main(String[] args) {
		
		//postDataFileStr();
		//callGetDataSet();
		//putDataFile();
		checkSanity();
	
	}
	
	public static void checkSanity(){
		RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(partUrlStr, String.class);
	     
	    System.out.println(result);
	}

}
