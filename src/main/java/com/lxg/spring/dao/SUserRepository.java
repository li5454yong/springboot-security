package com.lxg.spring.dao;

import com.lxg.spring.entity.SUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SUserRepository extends JpaRepository<SUser, Integer> {

    @Query("select u from SUser u where u.email=?1 and u.password=?2")
    SUser login(String email, String password);

    SUser findByEmailAndPassword(String email, String password);

    SUser findUserByEmail(String email);

}
