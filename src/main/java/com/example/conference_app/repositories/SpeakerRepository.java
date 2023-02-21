package com.example.conference_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.conference_app.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
