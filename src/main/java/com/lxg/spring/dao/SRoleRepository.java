package com.lxg.spring.dao;

import com.lxg.spring.entity.SRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SRoleRepository extends JpaRepository<SRole,Integer> {



}