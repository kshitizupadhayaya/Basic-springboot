package com.jpa.test.dbcucandsc.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDAO extends JpaRepository<Student, Integer>
{

}
