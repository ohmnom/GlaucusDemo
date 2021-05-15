package com.glaucus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glaucus.dao.INumberDao;
import com.glaucus.model.NumberIncrement;

@Service
public class NumberService implements INumberService {
	
	@Autowired
	private INumberDao numberDao;
	
	private final int id = 1;
	private int initialNumber = 0;
	
	/**
	 * Method to set values in NumberIncrement Entity.
	 * Id is set to final so that the same column gets updated.
	 */
	@Override
	public NumberIncrement incrementNumber() {
		
		NumberIncrement number = new NumberIncrement();
		
		try {
			initialNumber+= 1;
			number.setId(id);
			number.setCurrentValue(initialNumber);
			numberDao.save(number);
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		return number;
	}

}
