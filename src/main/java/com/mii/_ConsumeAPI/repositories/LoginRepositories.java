/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii._ConsumeAPI.repositories;

import com.mii._ConsumeAPI.entities.Employee;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BWP
 */
@Repository
public interface LoginRepositories extends CrudRepository<Employee, String>{
//    @Query(value="Select * from tb_m_department where id = ?1", nativeQuery = true)
//    public Department getById(String id);
}

