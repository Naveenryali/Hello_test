package com.data.db.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.data.db.demo.entity.StoreInformation;


public interface StoreInformationRepository extends JpaRepository<StoreInformation, Integer>{

}
