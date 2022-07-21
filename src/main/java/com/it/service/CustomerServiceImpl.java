package com.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.domain.CustomerVO;
import com.it.mapper.CustomerMapper;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class CustomerServiceImpl {
	
	private CustomerMapper mapper;
	
	@Autowired
	public CustomerServiceImpl(CustomerMapper mapper) {
		this.mapper = mapper;
	}

	public void customerInsert(CustomerVO vo) {
		log.info("insert....."+vo);
		mapper.insert(vo);
	}

	public List<CustomerVO> customerList() {
		// TODO Auto-generated method stub
		return mapper.list();
	}

	public CustomerVO customerDetail(int id) {
		// TODO Auto-generated method stub
		return mapper.detail(id);
	}

	public void customerUpdate(CustomerVO vo) {
		mapper.update(vo);
	}

	public void customerDelete(int id) {
		mapper.delete(id);
	}
	
}
