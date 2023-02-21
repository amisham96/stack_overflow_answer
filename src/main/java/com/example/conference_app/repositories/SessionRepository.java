package com.example.conference_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.conference_app.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
