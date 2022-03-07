package com.CS393.Project.repository;


import com.CS393.Project.model.Answer;
import com.CS393.Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
