package com.ujwalacode.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ujwalacode.studentsystem.model.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
