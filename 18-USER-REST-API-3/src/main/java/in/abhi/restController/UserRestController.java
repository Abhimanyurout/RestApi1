package in.abhi.restController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.abhi.binding.User;

@RestController
public class UserRestController {
	
	private Map<Integer, User> dataMap= new HashMap<>();
	
	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user){
		System.out.println(user);
		dataMap.put(user.getId(), user);
		return new ResponseEntity<String>("User Saved" ,HttpStatus.CREATED);
	}
}







