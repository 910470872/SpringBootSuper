package com.example.demo.jpa;

import com.example.demo.entity.EasybuyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by fly on 2018/10/29.
 */
public interface UserJpa extends JpaRepository<EasybuyUser,Long>,JpaSpecificationExecutor<EasybuyUser>,Serializable {
}
