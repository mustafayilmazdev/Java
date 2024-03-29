package com.mustafayilmazdev.hrmsv2.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_positions")
public class Job_Position {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "position_name")
	private String position_name;

	public Job_Position() {

	}

	public Job_Position(int id, String position_name) {
		super();
		this.id = id;
		this.position_name = position_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPosition_name() {
		return position_name;
	}

	public void setPosition_name(String position_name) {
		this.position_name = position_name;
	}

}
