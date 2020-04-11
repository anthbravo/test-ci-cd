package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Test;

public interface TestRepository extends JpaRepository<Test, Long> {

}
