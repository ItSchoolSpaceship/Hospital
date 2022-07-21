package com.it.mapper;

import java.util.List;

import com.it.domain.CustomerVO;

public interface CustomerMapper {
	
	public CustomerVO detail(int id);
	
	public List<CustomerVO> list();
	
	public void insert(CustomerVO vo);
	
	public void update(CustomerVO vo);
	
	public void delete(int id);

}
