package com.darsh.Userservice.repository;

import com.darsh.Userservice.entities.UserInfo;
import com.darsh.Userservice.entities.UserInfoDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface UserRepository extends CrudRepository<UserInfo, String>
{

    Optional<UserInfo> findByUserId(String userId);

}