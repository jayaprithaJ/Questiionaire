package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Questions;
import com.example.demo.repository.QuestionRepository;
 
@RestController
@RequestMapping("/")
public class QuestionaireController 
{
	@Autowired
	QuestionRepository questionRepository;

	    @GetMapping("/getQuestions")
	    public List<Questions> getQuestions(){
	        return questionRepository.findAll();
	    }
}