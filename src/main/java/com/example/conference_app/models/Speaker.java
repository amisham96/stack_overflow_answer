package com.example.conference_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Speaker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long speaker_id;
}
