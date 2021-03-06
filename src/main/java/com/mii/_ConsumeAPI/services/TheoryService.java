/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii._ConsumeAPI.services;

import com.mii._ConsumeAPI.entities.Employee;
import com.mii._ConsumeAPI.entities.Theory;
import com.mii._ConsumeAPI.repositories.TheoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import java.util.Collections;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author BWP
 */
@Service
public class TheoryService {
    
    @Autowired
    TheoryRepository theoryRepository;
    
    public Iterable<Theory> getAll(){
        return theoryRepository.findAll();
    }
    
    public Theory getById(String id){
        return theoryRepository.findById(new Integer(id)).get();
    }
    
    public Theory save(Theory theory){
        return theoryRepository.save(theory);
    }
    
    public void delete(String id){
        theoryRepository.delete(new Theory(Integer.parseInt(id)));
    }
    
    
}
