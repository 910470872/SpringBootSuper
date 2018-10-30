package com.example.demo.dao;

import com.example.demo.entity.EasybuyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by fly on 2018/10/29.
 */
public interface UserMapper {
    @Query("select password from Easybuy_user where userName=#{userName}")
    public String selectPasswordByUserName(String userName);
}
