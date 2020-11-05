package com.crud.SpringPostmanCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.SpringPostmanCrud.model.ProGradDetails;
import com.crud.SpringPostmanCrud.repository.ProGradDaoRepo;
import com.crud.SpringPostmanCrud.serviceImplementation.ProGradServiceImpl;

@RestController
@CrossOrigin("*")
public class ProGradController {
	@Autowired
	private ProGradServiceImpl progradservice;
	
	@PostMapping(value = "addPrograd")
	public String addNewProGrad(@RequestBody ProGradDetails prograd) {
		progradservice.addProGrad(prograd);
		return "Successfully added";
	}
	
	@PutMapping(value = "updatePrograd")
	public ProGradDetails updateProGrad(@RequestBody ProGradDetails prograd) {
		
		return progradservice.updateProGrad(prograd);
		
	}
	
	@DeleteMapping(value = "deletePrograd")
	public void deleteProGrad(@RequestParam int id) {
		progradservice.deleteProGrad(id);
		
	}
	
	@GetMapping(value = "getAllPrograds")
	public List<ProGradDetails> findAllProGrad(){
		return progradservice.getAllProGrads();
		
	}
}
