package com.naveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.model.Data;

@Repository
public interface Datarepo extends JpaRepository<Data, Integer>{

}
