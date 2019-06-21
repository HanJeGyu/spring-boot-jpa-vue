package com.saram.web.serviceImpl;

import java.util.List;

import com.saram.web.common.util.PageProxy;
import com.saram.web.domain.CustomerDTO;
import com.saram.web.service.CustomerService;

import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public void addCustomer(CustomerDTO customer) {
		
	}

	@Override
	public List<CustomerDTO> findCustomers(PageProxy pxy) {
		return null;
	}

	@Override
	public List<CustomerDTO> findCustomersByOption(CustomerDTO option) {
		return null;
	}

	@Override
	public CustomerDTO findCustomerByCustomerId(String customerId) {
		return null;
	}

	@Override
	public void updateCustomer(CustomerDTO customer) {
		
	}

	@Override
	public void deleteCustomer(CustomerDTO customer) {
		
	}

	@Override
	public int countAll() {
		return 0;
	}

	@Override
	public CustomerDTO login(CustomerDTO customer) {
		return null;
	}

    
}