package com.it.mapper;

import java.util.List;

import com.it.domain.CustomerVO;

public interface CustomerMapper {
	
	CustomerVO detail(int id);
	
	List<CustomerVO> list();
	
	void insert(CustomerVO vo);
	
	void update(CustomerVO vo);
	
	void delete(int id);

	

}
