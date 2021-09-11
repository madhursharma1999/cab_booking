package com.example.cab_booking.securityDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cab_booking.securityEntity.UserInfo;

public interface UserInfoDao extends JpaRepository<UserInfo,Integer> {
        UserInfo findUserByUsername(String username);
}
