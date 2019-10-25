package com.home.lingvo.infrastructure.persistance.repositories;

import com.home.lingvo.infrastructure.persistance.entities.WordData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaWordRepository extends JpaRepository<WordData, Long> {
}
