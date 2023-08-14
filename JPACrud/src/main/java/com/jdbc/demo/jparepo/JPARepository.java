package com.jdbc.demo.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdbc.demo.model.JPASignUpModel;

@Repository
public interface JPARepository extends JpaRepository<JPASignUpModel,String> {

}
