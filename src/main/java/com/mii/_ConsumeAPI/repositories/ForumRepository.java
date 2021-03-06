/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii._ConsumeAPI.repositories;

import com.mii._ConsumeAPI.entities.Forum;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author iqbaloutlaw
 */
@Repository
public interface ForumRepository extends CrudRepository<Forum, Integer>{
    @Query(value = "SELECT * FROM Forum WHERE id = ?1", nativeQuery = true)
    public Forum getById(Integer id);
    
    @Query(value = "SELECT * FROM Forum WHERE id LIKE ?1 OR topic LIKE ?1 OR forum_description LIKE ?1 OR date_forum LIKE ?1", nativeQuery = true)
    public Iterable<Forum> searchForum(String key);
    
    @Query(value = "SELECT id FROM Forum ORDER BY id DESC LIMIT 1", nativeQuery = true)
    public Integer getByDataDesc();
}
