package ua.lviv.lg.service.implementation;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lg.dao.BuyerDao;
import ua.lviv.lg.entity.Buyer;
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService{
@Autowired
private BuyerDao buyerDao;
@Transactional
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
	Buyer buyer=null;
	try {
		  buyer=buyerDao.findByUserName(userName);
	} catch (NoResultException e) {
	return null;
	}
	Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
	authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
	return new User(String.valueOf(buyer.getIdBuyer()), buyer.getPassword(),authorities);
}
}
