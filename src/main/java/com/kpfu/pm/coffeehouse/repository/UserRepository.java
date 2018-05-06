package com.kpfu.pm.coffeehouse.repository;

import com.kpfu.pm.coffeehouse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

     User findOneByPhoneNumber(String phone);

     User findOneByUsername(String username);

}
