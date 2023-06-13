package com.one.sug.Company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.one.sug.CompanyModel.ModelCompany;
import com.one.sug.RepositoryCompany.RepoCompany;
import com.one.sug.ServiceCompany.Sercompany;
import com.one.sug.exception.UserNotFoundException;

@RestController
@CrossOrigin("http://localhost:3000")
public class CompanyControler {
     @Autowired
     private RepoCompany repo ;
     @Autowired
     private Sercompany serv;
     @PostMapping("user/login")
 	public String validateUser(@RequestBody ModelCompany u)
 	{
 	System.out.println(u.getEmail());
 		return serv.validateUser(u.getEmail(),u.getPassword());
 	}
     @PostMapping("/user")
     ModelCompany newUser(@RequestBody  ModelCompany newUser )
     {
    	 return repo.save(newUser);
     }
     @GetMapping("/getusers")
     List<ModelCompany> getallusers(){
    		 return repo.findAll();
    	 }
     
     @GetMapping("/user/{id}")
     ModelCompany getUserById(@PathVariable Long id)
     {
           return repo.findById(id)
        		   .orElseThrow(()->new UserNotFoundException(id));
     }
     @PutMapping("/user/{id}")
     ModelCompany updateuser(@RequestBody ModelCompany newUser,@PathVariable Long id )
     {
    	 return repo.findById(id)
    			 .map(ModelCompany -> {
    				 ModelCompany.setFirstName(newUser.getFirstName());
    				 ModelCompany.setLastName(newUser.getLastName());
    				 ModelCompany.setEmail(newUser.getEmail());
    				 ModelCompany.setPassword(newUser.getPassword());
    				 return repo.save(ModelCompany);
    			 }).orElseThrow(()->new UserNotFoundException(id));
     }

     @DeleteMapping("/user/{id}")
     String deleteUser(@PathVariable Long id) {
     if(!repo.existsById(id)){
    	 throw new UserNotFoundException(id);
     }
     repo.deleteById(id);
     return "User with id"+id+"has been deleted successfully";
 
     }
}


