package com.example.school_service.repository;

import com.example.school_service.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School,Integer> {
}
