package com.trustlens.backend;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FakeNewsRepository extends JpaRepository<FakeNews, Integer> {
}