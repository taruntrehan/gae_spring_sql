/**
 * 
 */
package blog.allzhere.in.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ttrehan
 *
 */
@RestController
public class ApiController {

	@RequestMapping(value="/sanity",method = RequestMethod.GET)
	public List<String> sanityCheckCall() {
		try {
			System.out.println("Inside sanityCheckCall for foresee webapp.");
			//System.out.println("Inside getAllTasks");
			//List<Task> tasks=taskmanagerservice.getAllTasks();
			List<String> tasks=new ArrayList<String>();
			tasks.add("First");
			tasks.add("Second");
			tasks.add("Third");
			tasks.add("Fourth");
			System.out.println("List size :"+tasks.size()+"--List--"+tasks);
			return tasks;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}	
}