package com.crud.SpringPostmanCrud.serviceInterface;

import java.util.List;

import com.crud.SpringPostmanCrud.model.ProGradDetails;

public interface ProGradServiceInterface {
	public void addProGrad(ProGradDetails prograd);
	public ProGradDetails updateProGrad(ProGradDetails prograd);
	public void deleteProGrad(int id);
	public List<ProGradDetails> getAllProGrads();
}
