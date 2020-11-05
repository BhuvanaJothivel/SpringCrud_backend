package com.crud.SpringPostmanCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.SpringPostmanCrud.model.*;

@Repository
public interface ProGradDaoRepo extends JpaRepository<ProGradDetails, Integer>{

}
