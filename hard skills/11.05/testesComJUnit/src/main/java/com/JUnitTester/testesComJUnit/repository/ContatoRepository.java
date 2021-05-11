package com.JUnitTester.testesComJUnit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JUnitTester.testesComJUnit.model.ContatoModel;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoModel, Long>{

}
