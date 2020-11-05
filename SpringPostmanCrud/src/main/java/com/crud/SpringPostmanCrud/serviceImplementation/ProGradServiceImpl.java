package com.crud.SpringPostmanCrud.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.SpringPostmanCrud.model.ProGradDetails;
import com.crud.SpringPostmanCrud.repository.ProGradDaoRepo;
import com.crud.SpringPostmanCrud.serviceInterface.ProGradServiceInterface;

@Service
public class ProGradServiceImpl implements ProGradServiceInterface{

	@Autowired
	private ProGradDaoRepo prograddao;
	
	@Override
	public void addProGrad(ProGradDetails prograd) {
		prograddao.save(prograd);
		
	}

	@Override
	public ProGradDetails updateProGrad(ProGradDetails prograd) {
		// TODO Auto-generated method stub
		return prograddao.save(prograd);
	}

	@Override
	public void deleteProGrad(int id) {
		// TODO Auto-generated method stub
		prograddao.deleteById(id);
	}

	@Override
	public List<ProGradDetails> getAllProGrads() {
		
		return prograddao.findAll();
	}

}
