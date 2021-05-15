package com.glaucus.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glaucus.model.NumberIncrement;

public interface INumberDao extends JpaRepository<NumberIncrement, Integer>  {

}
