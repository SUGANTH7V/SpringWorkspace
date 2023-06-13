package com.one.sug.Company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.one.sug.ServiceCompany.UserService;
import com.one.sug.CompanyModel.Usermodel;
import com.one.sug.RepositoryCompany.UserRepository;
import com.one.sug.ServiceCompany.UserService;
import com.one.sug.exception.UserNotFoundException;

@RestController
@CrossOrigin("http://localhost:3000")
public class usercontroller {
	@Autowired
	private UserRepository rep;
	@Autowired
	private UserService serv;
	@PostMapping("/company")
	Usermodel newcom(@RequestBody Usermodel newcom )
	{
		return rep.save(newcom);
	}
	@GetMapping("/getcom")
	List<Usermodel> getallcom(){
		return rep.findAll();
	}
	@GetMapping("/getcom/{Comid}")
	Usermodel getcombyid (@PathVariable Long Comid)
	{
		return rep.findById(Comid)
			.orElseThrow(()->new UserNotFoundException(Comid));
			
	}
	@DeleteMapping("/getcom/{Comid}")
	   String deleteUser(@PathVariable Long Comid) {
	     if(!rep.existsById(Comid)){
	    	 throw new UserNotFoundException(Comid);
	     }
	     rep.deleteById(Comid);
	     return "User with id "+Comid+" has been deleted successfully";
	 
	     }
	
	@GetMapping("/sort/{CompanyName}")
	public List<Usermodel> sorting(@PathVariable("name")String CompanyName)
	{
		 return serv.sorting(CompanyName);
	}
	
	//pagination
	
	@GetMapping("/page/{pnum}/{psize}")
	public List<Usermodel> page(@PathVariable("pnum")int num,@PathVariable("psize")int size)
	{
		return serv.page(num,size);
	}
	
	//pagination sorting
	
	@GetMapping("/pagesort/{pnum}/{psize}/{name}")
	public List<Usermodel> paginationsorting(@PathVariable("pnum")int pnum,@PathVariable("psize")int psize,@PathVariable("name")String CompanyName)
	{
		return serv.paginationsorting(pnum,psize,CompanyName);
	}
}
