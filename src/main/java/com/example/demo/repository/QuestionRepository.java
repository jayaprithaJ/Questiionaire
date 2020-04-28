package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Questions;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Questions, Object> {
	List<Questions> findAll();
}