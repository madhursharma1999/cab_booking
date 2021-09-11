package com.example.cab_booking.securityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.cab_booking.securityDao.UserInfoDao;
import com.example.cab_booking.securityEntity.UserInfo;
import com.example.cab_booking.securityEntity.UserInfoDetails;
@Service
public class UserInfoService implements UserDetailsService {
    @Autowired
    private UserInfoDao dao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo user=dao.findUserByUsername(username);
        if(user==null)
            throw new UsernameNotFoundException("This User doesn't exits");
        return new UserInfoDetails(user);
    }
}
