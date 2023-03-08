package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cart;
import com.example.demo.repo.CartRepository;
import com.example.demo.service.CartService;

@Service
public  class CartServiceimpl implements CartService {
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart add(Cart cart) {
		
		return cartRepository.save(cart);
	}
	
	

}
