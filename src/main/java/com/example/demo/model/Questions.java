package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Questions {
	 
	   public Questions() {
	       
	   }
	   public Questions(int id, String question, String dificultyRange, Integer weightage) {
	      super();
	      this.id = id;
	      this.question = question;
	      this.dificultyRange = dificultyRange;
	      this.weightage = weightage;
	   }
	    
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private int id;
	   @Column(name="Questions")
	   private String question;
	   @Column(name="difficulty_Range")
	   private String dificultyRange;
	   @Column(name="weightage")
	   private Integer weightage;
	   
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getDificultyRange() {
		return dificultyRange;
	}
	public void setDificultyRange(String dificultyRange) {
		this.dificultyRange = dificultyRange;
	}
	public Integer getWeightage() {
		return weightage;
	}
	public void setWeightage(Integer weightage) {
		this.weightage = weightage;
	}
	    
}
