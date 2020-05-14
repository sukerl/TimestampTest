package com.example.demo;

import java.sql.Timestamp;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TimestampTestRepository extends JpaRepository<TimestampTest, Timestamp> {
	
	//Optional<TimestampTest> findById(Timestamp timestamp);
	Optional<TimestampTest> findById(Timestamp timestamp);
	
}
