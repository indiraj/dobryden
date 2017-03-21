package com.dobryden.DAO;

import org.springframework.stereotype.Service;

import com.dobryden.model.SellerReg;



@Service
public interface SellerDAO
{
	public boolean insert_Seller(SellerReg d);
}
